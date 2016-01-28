package com.edibca.imagenampliada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class vista extends AppCompatActivity {
    public ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);
        imagen = (ImageView) findViewById(R.id.imageZoom);
        imagen.setImageDrawable(General.drawable);
        //imagen.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

}

