package com.example.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.id_tv_name);
        email = findViewById(R.id.id_tv_email);

        Person person = new Person("Jack", "jack@gmail.com");

        name.setText(person.getName());
        email.setText(person.getEmail());
    }
}