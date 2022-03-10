package com.ksp.subitesv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Cliente;
    Button Conductor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Cliente = findViewById(R.id.BtnCliente);
        Conductor = findViewById(R.id.BtnConductor);

        Cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SeleccionAutenticacion();
            }
        });

        Conductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SeleccionAutenticacion();
            }
        });
    }

    private void SeleccionAutenticacion(){
        Intent intent = new Intent(this,SeleccionAutenticacion.class);
        startActivity(intent);
    }
}