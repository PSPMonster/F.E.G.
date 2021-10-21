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

    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_TEXT1 = "com.example.application.example.EXTRA_TEXT1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);


    }



    public void login(View view) {
        EditText inputName = (EditText) findViewById(R.id.editTextTextPersonName);
        String saveName = inputName.getText().toString();

        EditText inputSurname = (EditText) findViewById(R.id.editTextTextPersonSurname);
        String saveSurname = inputSurname.getText().toString();

        Intent intent = new Intent(this, MainMenuActivity.class);
        intent.putExtra(EXTRA_TEXT, saveName);
        intent.putExtra(EXTRA_TEXT1, saveSurname);

        startActivity(intent);
    }
}