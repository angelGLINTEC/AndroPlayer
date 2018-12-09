package com.glintec.app.androidplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnrec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnrec = findViewById(R.id.btnRec);
        View.OnClickListener clRec = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirReproductor();
            }
        };
        btnrec.setOnClickListener(clRec);
    }

    public void abrirReproductor(){
        Intent inte = new Intent(Intent.ACTION_VIEW);
//        Uri data = Uri.parse("file:///sdcard" + "song_1.mp3");
        Uri data = Uri.parse("android.resource://" +getPackageName()+"/"+R.raw.rock);
        getIntent().setDataAndType(data,"audio/mp3");
        startActivity(inte);
    }
}
