package com.taller2.tutoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class InicioActivity extends AppCompatActivity {

    LinearLayout ButtonTutoriaUno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ButtonTutoriaUno = findViewById(R.id.button_materia_t1);

        ButtonTutoriaUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSelectAuth();
            }
        });
    }
    private void goToSelectAuth() {
        Intent intent = new Intent(InicioActivity.this,TutoriaUnoActivity.class);
        startActivity(intent);
    }
}