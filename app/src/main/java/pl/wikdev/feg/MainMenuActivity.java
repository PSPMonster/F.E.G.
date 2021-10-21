package pl.wikdev.feg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void backToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void przedmiotAng(View view) {
        Intent intent1 = new Intent(this, PrzedmiotAngielski.class);
        startActivity(intent1);
    }
    public void backtoMenu(View view) {
        Intent intent1 = new Intent(this, MainMenuActivity.class);
        startActivity(intent1);
    }
}