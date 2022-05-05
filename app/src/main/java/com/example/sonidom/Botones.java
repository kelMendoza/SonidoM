package com.example.sonidom;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Botones extends AppCompatActivity {

    ImageButton btnGato, btnPerro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnGato = findViewById(R.id.gato);
        btnPerro = (ImageButton) findViewById(R.id.perro);

        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Botones.this,R.raw.audiogatito);
                mp.start();
            }
        });
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Botones.this,R.raw.audioperrito);
                mp.start();
            }
        });
    }

    public void MensajeGato(View view){
        Toast.makeText(this, "Esto es un gatito", Toast.LENGTH_LONG).show();
    }
    public void MensajePerro(View view){
        Toast.makeText(this, "Esto es un perrito", Toast.LENGTH_LONG).show();
    }
}

