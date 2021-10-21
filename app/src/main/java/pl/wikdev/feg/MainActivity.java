package pl.wikdev.feg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getApplicationContext().getSharedPreferences("userName", Context.MODE_PRIVATE);
        String savedName = sp.getString("userName", "");

        sp = getApplicationContext().getSharedPreferences("userSurname", Context.MODE_PRIVATE);
        String savedSurname = sp.getString("userSurname", "");


    }


    public void saveName(String name, String surname) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("userName", name);
        editor.putString("userSurname", surname);
        editor.apply();
    }

    public void login(View view) {
        EditText inputName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText inputSurname = (EditText) findViewById(R.id.editTextTextPersonSurname);

        String userName = inputName.getText().toString();
        String userSurname = inputSurname.getText().toString();
        saveName(userName, userSurname);
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}