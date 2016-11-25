package com.jesusalvizo.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        //VideoView videoView = (VideoView) findViewById(R.id.videoView);
        //MediaController mediaController = new MediaController(this);
        //mediaController.setAnchorView(videoView);
        //Uri uri = Uri.parse("rtsp://r1---sn-q4f7sn7l.googlevideo.com/Cj0LENy73wIaNAmHYlVZdJI_EBMYDSANFC34lzdYMOCoAUIASARgs8-N08eK0ZZYigELSmhidDY5R2ZZS1kM/DF5945831C2349A06E7924A832DC4F4C2FC12D55.664FCB23193AA8A6211CBDD041C466B0F116E0B9/yt6/1/video.3gp");
        //videoView.setMediaController(mediaController);
        //videoView.setVideoURI(uri);
        //videoView.requestFocus();
        //videoView.start();

        Button videoscreen1 = (Button) findViewById(R.id.button);
        videoscreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main9Activity.this, Main11Activity.class);
                startActivity(intent);
            }
        });


        Button videoscreen3 = (Button) findViewById(R.id.button3);
        videoscreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main9Activity.this, Main13Activity.class);
                startActivity(intent);
            }
        });

        Button videoscreen4 = (Button) findViewById(R.id.button4);
        videoscreen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main9Activity.this, Main14Activity.class);
                startActivity(intent);
            }
        });


    }
}