package com.example.semana5_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Implementar en la clase onClic ... pedir implementr método
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    Button iniciar, parar;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Aquí enlazamos nuestras variables con los vistas en el activity
        iniciar = (Button)findViewById(R.id.btnIniciar);
        parar   = (Button)findViewById(R.id.btnDetener);
        mediaPlayer = MediaPlayer.create(this,R.raw.audio);

        // Los botones necesitas escuchar cuando se haga clic su correspondiente enlace en la vista.
                iniciar.setOnClickListener(this);
                parar.setOnClickListener(this);
      }

    // Este método permite a través de un Switch (estructura de control // condicional de casos) seleccionar la acción de cada uno de los botones.
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnIniciar:
                play();
                break;
            case R.id.btnDetener:
                stop();
                break;
        }
    }
    // Iniciar la canción
    private void play(){
        mediaPlayer.start();
    }

    // Para la ejecución de forma total
    private void stop(){
        mediaPlayer.stop();
    }

    //cambiar pantalla
     public void siguiente(View view){
        Intent siguiente = new Intent(this, video.class);
        startActivity(siguiente);

     }
}