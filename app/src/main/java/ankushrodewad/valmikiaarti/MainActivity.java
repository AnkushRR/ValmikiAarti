package ankushrodewad.valmikiaarti;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    MediaPlayer mediaPlayer1;
    public void button1 (View view){
        mediaPlayer1 = MediaPlayer.create(this, R.raw.aarti);

        Button button_aarti = (Button) findViewById(R.id.button1);
        mediaPlayer1.start();
        mediaPlayer1.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
        button_aarti.setClickable(false);

}
    public void stopAarti (View view){
        mediaPlayer1.stop();
        Button button_aarti = (Button) findViewById(R.id.button1);
        button_aarti.setClickable(true);
}
}
