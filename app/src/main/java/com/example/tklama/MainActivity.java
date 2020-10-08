package com.example.tklama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.zagum.switchicon.SwitchIconView;

import libs.mjn.scaletouchlistener.ScaleTouchListener;

public class MainActivity extends AppCompatActivity {

    SwitchIconView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.switchIconViev1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.switchState();

            }
        });
    }
    ScaleTouchListener.Config config = new ScaleTouchListener.Config(
            300,    // Duration
            0.75f,  // ScaleDown
            0.75f); // Alpha

}
