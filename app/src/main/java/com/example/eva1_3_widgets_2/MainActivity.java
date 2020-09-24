package com.example.eva1_3_widgets_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarar un objeto del mismo tipo de widget  a modificar
    TextView txtHolamundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //No existe la interfaz grafica
        setContentView(R.layout.activity_main);
        //Ya existe una interfaz grafica
        //Vincular el componente
        //R.java = indice


    }
}