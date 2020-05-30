package com.example.intentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends Activity {
    private static final String TAG="Intent recogiendo datos";
    private TextView pelicula, serie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        Intent intent = getIntent();
        String peliculaElegida= intent.getStringExtra("pelicula_preferida");
        String serieElegida= intent.getStringExtra("serie_preferida");
        pelicula= (TextView) findViewById(R.id.resultado_pelicula);
        serie=(TextView) findViewById(R.id.resultado_serie);
        pelicula.setText(peliculaElegida);
        serie.setText(serieElegida);
    }
}
