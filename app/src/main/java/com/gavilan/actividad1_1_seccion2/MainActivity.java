package com.gavilan.actividad1_1_seccion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Referenciar al elemento visual
    TextView txt_contador;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Vincular
        txt_contador = findViewById(R.id.txt_contador);
        // aplicar conversión - int a str
        // larga
        txt_contador.setText( String.valueOf(count) );
        /*
        forma
            corta
         */
        //txt_contador.setText(count+"");

    }

    public void Saludar(View view){
        String mensaje = "Bienvenidos al mundo ANDROID";
        Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_LONG).show();
    }

    public void Contar(View view){
        // aumentar el valor de la variable count en 1
        //count = count + 1;
        //count += 1;
        count++;
        // pintar en el txt el valor de la variable count
        txt_contador.setText( String.valueOf(count) );
    }


}