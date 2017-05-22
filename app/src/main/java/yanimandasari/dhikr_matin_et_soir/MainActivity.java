package yanimandasari.dhikr_matin_et_soir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bPrayShow, bPrayPlay, bMorningShow, bMorningPlay, bEveningShow, bEveningPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button initialization
        bPrayShow = (Button)findViewById(R.id.b_pray_show);
        bMorningShow = (Button)findViewById(R.id.b_morning_show);
        bEveningShow = (Button) findViewById(R.id.b_evening_show);

        bPrayPlay = (Button)findViewById(R.id.b_pray_play);
        bMorningPlay = (Button)findViewById(R.id.b_morning_play);
        bEveningPlay = (Button) findViewById(R.id.b_evening_play);

        bPrayShow.setOnClickListener(this);
        bMorningShow.setOnClickListener(this);
        bEveningShow.setOnClickListener(this);

        bPrayPlay.setOnClickListener(this);
        bMorningPlay.setOnClickListener(this);
        bEveningPlay.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.b_pray_show:
                Intent i = new Intent(MainActivity.this, Priere_page.class);
                startActivity(i);
                break;

            case R.id.b_morning_show:
                Intent j = new Intent(MainActivity.this, Matin_page.class);
                startActivity(j);
                break;

            case R.id.b_evening_show:
                Intent k = new Intent(MainActivity.this, Soir_page.class);
                startActivity(k);
                break;

            case R.id.b_pray_play:
                break;

            case R.id.b_morning_play:
                break;

            case R.id.b_evening_play:
                break;
        }
    }
}
