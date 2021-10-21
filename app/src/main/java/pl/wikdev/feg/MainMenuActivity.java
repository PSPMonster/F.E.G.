package pl.wikdev.feg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    TextView tvName;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Intent intent = getIntent();
        String savedName = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String savedSurname = intent.getStringExtra(MainActivity.EXTRA_TEXT1);

        saveFullName(savedName, savedSurname);

//        sp = getSharedPreferences("prefUserName", 0);
//        String name = sp.getString("prefUserName", "Error");

        tvName = (TextView)findViewById(R.id.tvFullName);
        tvName.setText("xD");

    }

    public void backToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

//    private void saveFullName(String name, String surname) {
//        SharedPreferences.Editor mEditor = sp.edit();
//        mEditor.putString("prefUserName", name).commit();
//        mEditor.putString("prefUserSurname", surname).commit();
//        mEditor.apply();
//    }

    public void przedmiotAng(View view) {
        Intent intent1 = new Intent(this, PrzedmiotAngielski.class);
        startActivity(intent1);
    }
    public void backtoMenu(View view) {
        Intent intent1 = new Intent(this, MainMenuActivity.class);
        startActivity(intent1);
    }

}