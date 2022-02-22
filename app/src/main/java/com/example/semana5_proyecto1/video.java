package com.example.semana5_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = findViewById(R.id.videoView);
        String path = "android.resource://"+ getPackageName() + "/" + R.raw.Video1;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();

    }


    //regresar pantalla
    public void anterior(View view){
        Intent anterior = new Intent (this, MainActivity.class);
        startActivity(anterior);
    }
}