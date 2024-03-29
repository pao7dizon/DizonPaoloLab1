package com.example.dizon_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               openPortal();
           }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openGreetings();
            }

        });
    }
    public void openPortal(){
        Intent intent = new Intent(this, Portal.class);
        startActivity(intent);
    }
    public void openGreetings(){
        Intent intent = new Intent(this, Greetings.class);
        startActivity(intent);
    }
}
