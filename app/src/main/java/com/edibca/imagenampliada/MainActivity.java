package com.edibca.imagenampliada;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView, imageView2, imageView1;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadView();
    }

    private void loadView() {

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView1);
        imageView1 = (ImageView) findViewById(R.id.imageView2);
        imageView.setOnClickListener(MainActivity.this);
        imageView1.setOnClickListener(MainActivity.this);
        imageView2.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView:
                General.drawable = imageView.getDrawable();
                break;

            case R.id.imageView1:
                General.drawable = imageView1.getDrawable();
                break;
            case R.id.imageView2:
                General.drawable = imageView2.getDrawable();
                break;
        }
        intent = new Intent(this, vista.class);
        startActivity(intent);
    }
}
