package com.salesianos.jose.intencionesimplicitas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Recoger extends AppCompatActivity {

    private TextView mTexto = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recoger);

        Intent mIntent = getIntent();
        String dato = mIntent.getDataString().toString();

        mTexto = (TextView) findViewById(R.id.texto);

        mTexto.setText(dato);

    }
}
