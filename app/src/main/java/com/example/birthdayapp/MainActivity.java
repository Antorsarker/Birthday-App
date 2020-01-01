package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEdittext,birthdayEditText;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdittext=findViewById(R.id.nameID);
        birthdayEditText=findViewById(R.id.birthdayID);
        saveButton=findViewById(R.id.saveButtonID);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=nameEdittext.getText().toString();
                String birthday=birthdayEditText.getText().toString();

                Toast.makeText(MainActivity.this, "save"+name+" "+birthday, Toast.LENGTH_SHORT).show();



            }
        });

    }


}
