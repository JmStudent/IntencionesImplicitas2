package com.salesianos.jose.intencionesimplicitas2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void callIntent(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.boton1:
                String url = "http://www.salesianos-cadiz.com/";
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.boton2:
                url = "geo:41.656313,-0.877351";
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.boton3:
                url = "geo:geo:0,0?q=avenida maría auxiliadora, Cádiz";
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.boton5:
                intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:(+34)962849347"));
                startActivity(intent);
                break;
            case R.id.boton6:
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent, 0);
                break;
            case R.id.boton7:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
                intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { " raul.gil@salesianos-cadiz.com" });
                startActivity(intent);
                break;
            case R.id.boton8:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(intent);
                break;
        }
    }
}
