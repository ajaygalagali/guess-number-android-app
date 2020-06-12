package com.astro.guessnumber;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.inputId);

    }
    Random ajay = new Random();
    int random_number = ajay.nextInt(10);


    public void btnclick(View view){

        String user_string = num.getText().toString();


        if(user_string.isEmpty()){

            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }else {
            int user_number = Integer.parseInt(user_string);

            if (user_number > random_number) {
                Toast.makeText(this, "Go Less!", Toast.LENGTH_SHORT).show();
            } else if (user_number < random_number) {
                Toast.makeText(this, "Go Higher!", Toast.LENGTH_SHORT).show();
            } else if (user_number == random_number) {
                Toast.makeText(this, "You guessed number right!!!", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
