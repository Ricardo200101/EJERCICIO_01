package com.example.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2;
    TextView tv1;
    Button btnCalcular;
    Button iratres;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        et1=(EditText) findViewById(R.id.editTxtPeso);
        et2=(EditText) findViewById(R.id.ediTxtAltura);
        tv1=(TextView) findViewById(R.id.txtResul);
        btnCalcular=(Button) findViewById(R.id.btn1);
        btnCalcular.setOnClickListener(this);
        iratres=(Button) findViewById(R.id.btn3);
        iratres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantatres=new Intent(getApplicationContext(), pantalla3.class);
                startActivity(pantatres);
            }
        });

    }

    @Override
    public void onClick(View view) {

        float peso, altura, resul1, resul2,  resul3;

        peso = Float.parseFloat(et1.getText().toString());
        altura = Float.parseFloat(et2.getText().toString());

        resul1 = altura*altura;
        resul2 = resul1/peso;
        tv1.setText("SU GRASA CORPORAL ES DE: "+resul2);




    }
}