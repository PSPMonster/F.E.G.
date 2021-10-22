package pl.wikdev.feg;

import static pl.wikdev.feg.MainActivity.globalPreferenceName;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        tvName = (TextView)findViewById(R.id.tvFullName);

        globalPreferences();

    }


    public void przedmiotAng(View view) {
        Intent intent1 = new Intent(this, PrzedmiotAngielski.class);
        startActivity(intent1);
    }


    public void backtoMenu(View view) {
        Intent intent1 = new Intent(this, MainMenuActivity.class);
        startActivity(intent1);
    }
    public void przedmiotMat(View view) {
        Intent intent1 = new Intent(this, PrzedmiotMatma.class);
        startActivity(intent1);
    }

    public void globalPreferences() {
        SharedPreferences sharedPreferences = getSharedPreferences(MainActivity.globalPreferenceName, MODE_PRIVATE);
        String name = sharedPreferences.getString("userName", "Error");
        String surname = sharedPreferences.getString("userSurname", "Error");

        changeAvatar(name);

        tvName.setText(name + " " + surname);
    }

    public void backToLogin(View view) {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void changeAvatar(String name) {
        ImageView imgAvatar = findViewById(R.id.userAvatar);
        if(name.endsWith("a")) {
            imgAvatar.setImageResource(R.drawable.female_avatar);
        }
        else {
            imgAvatar.setImageResource(R.drawable.male_avatar);
        }
    }

}