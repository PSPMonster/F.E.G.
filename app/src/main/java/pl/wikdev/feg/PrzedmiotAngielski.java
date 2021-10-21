package pl.wikdev.feg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrzedmiotAngielski extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przedmiot_angielski);
    }
    public void backtoMenu(View view) {
        Intent intent1 = new Intent(this, MainMenuActivity.class);
        startActivity(intent1);
    }
}