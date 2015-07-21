package co.mobiwise.musicplayerprogressview;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import co.mobiwise.library.MusicPlayerView;


public class MainActivity extends Activity{

    MusicPlayerView mpv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpv = (MusicPlayerView) findViewById(R.id.mpv);
        mpv.setCoverURL("https://upload.wikimedia.org/wikipedia/en/b/b3/MichaelsNumberOnes.JPG");

        mpv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mpv.isRotating())
                    mpv.stop();
                else
                    mpv.start();
            }
        });
    }

}
