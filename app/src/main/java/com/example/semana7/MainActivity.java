package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    Button  boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.BTaceptar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sIntent = new Intent(getApplicationContext(), inicio.class);
                EditText ETNombre=(EditText) findViewById(R.id.ETNombreFoto);
                String StNombre= ETNombre.getText().toString();


                sIntent.putExtra("StNombre", StNombre);
                startActivity(sIntent);
            }
        });

    }
}