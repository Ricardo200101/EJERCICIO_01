package com.example.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button irados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        irados=(Button)findViewById(R.id.btn2);
        irados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantados=new Intent(getApplicationContext(), pantalla2.class);
                startActivity(pantados);
            }
        });
    }
}