package com.example.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // instance of data binding for main activity
    private ActivityMainBinding activityMainBinding;

    // instance of MainActivityClickHandler
    private MainActivityClickHandler clickHandler;  // name should be same as xml variable name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("Jack", "jack@gmail.com");

        // data binding 4 step (for TextViews)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setPerson(person);

        // data binding (for event handlers)
        clickHandler = new MainActivityClickHandler(this);
        activityMainBinding.setClickHandler(clickHandler);
    }

    // Internal class inside MainActivity.java
    public class MainActivityClickHandler {
        // Context variable
        Context context;

        // Constructor
        public MainActivityClickHandler(Context context) {
            this.context = context;
        }

        // First button onClick handler method
        public void onButton1Click(View view) {
            Toast.makeText(context, "Hello Friends", Toast.LENGTH_SHORT).show();
        }

        // Second Button onClick handler method
        public void onButton2Click(View view) {
            Toast.makeText(context, "Bye Friends", Toast.LENGTH_SHORT).show();
        }
    }
}