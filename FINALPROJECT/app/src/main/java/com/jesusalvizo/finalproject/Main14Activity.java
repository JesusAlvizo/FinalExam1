package com.jesusalvizo.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        //videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.pie);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
