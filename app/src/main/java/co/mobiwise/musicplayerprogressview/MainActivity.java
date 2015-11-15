package co.mobiwise.musicplayerprogressview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import co.mobiwise.playerview.MusicPlayerView;

public class MainActivity extends Activity {

  MusicPlayerView mpv;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mpv = (MusicPlayerView) findViewById(R.id.mpv);
    mpv.setCoverURL("https://upload.wikimedia.org/wikipedia/en/b/b3/MichaelsNumberOnes.JPG");

    mpv.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        if (mpv.isRotating()) {
          mpv.stop();
        } else {
          mpv.start();
        }
      }
    });
  }
}
