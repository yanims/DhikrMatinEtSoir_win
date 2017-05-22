package yanimandasari.dhikr_matin_et_soir;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by yani.mandasari on 23/02/2016.
 */
public class Priere_page extends AppCompatActivity implements View.OnClickListener{

    TextView tv_xx, tv_yy, tv_translation, tv_sanad, tv_arabic_text;
    Button b_left, b_right, b_speak, b_mute;
    String [] ar_text, in_text, sn_text;
    int index;

    //path to font location
    //private static final String FontPath = "DroidNaskh-Regular.ttf";
    private static final String FontPath = "Al Qalam Quran.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.priere_page);

        //Text view initialization
        tv_xx = (TextView) findViewById(R.id.tv_XX);
        tv_yy = (TextView) findViewById(R.id.tv_YY);
        tv_arabic_text = (TextView) findViewById(R.id.tv_arabic_text);
        tv_translation = (TextView) findViewById(R.id.tv_indonesian_text);
        tv_sanad = (TextView) findViewById(R.id.tv_sanad);

        //Button initialization
        b_left = (Button) findViewById(R.id.b_left);
        b_right = (Button) findViewById(R.id.b_right);
        b_speak = (Button) findViewById(R.id.b_speak);
        //b_mute = (Button) findViewById(R.id.b_mute);

        //button onClickListener
        b_left.setOnClickListener(this);
        b_right.setOnClickListener(this);
        b_speak.setOnClickListener(this);
        //b_mute.setOnClickListener(this);

        //importing string array from values folder
        ar_text = getResources().getStringArray(R.array.priere_arabic_text_array);
        in_text = getResources().getStringArray(R.array.priere_indonesian_text_array);
        sn_text = getResources().getStringArray(R.array.priere_sanad_array);

        //init index of string array
        index = 0;

        //load the font and define typeface accordingly
        Typeface tf = Typeface.createFromAsset(getAssets(), FontPath);

        //apply font for the text view object of arabic text
        tv_arabic_text.setTypeface(tf);

        //setting values for text views
        tv_arabic_text.setText(ar_text[index]);
        tv_translation.setText(in_text[index]);
        tv_sanad.setText(sn_text[index]);
        tv_xx.setText(String.valueOf(index+1));
        tv_yy.setText("/"+String.valueOf(ar_text.length));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            //button left
            case R.id.b_left:
                index--;
                //if reach the first page
                if(index<0)
                {
                    index = ar_text.length - 1;

                    tv_arabic_text.setText(ar_text[index]);
                    tv_translation.setText(in_text[index]);
                    tv_sanad.setText(sn_text[index]);
                    tv_xx.setText(String.valueOf(index + 1));
                }
                else
                {
                    tv_arabic_text.setText(ar_text[index]);
                    tv_translation.setText(in_text[index]);
                    tv_sanad.setText(sn_text[index]);
                    tv_xx.setText(String.valueOf(index + 1));
                }
                break;

            //button right
            case R.id.b_right:
                index++;
                if (index == ar_text.length)
                {
                    index = 0;
                    tv_arabic_text.setText(ar_text[index]);
                    tv_translation.setText(in_text[index]);
                    tv_sanad.setText(sn_text[index]);
                    tv_xx.setText(String.valueOf(index + 1));
                }
                else
                {
                    tv_arabic_text.setText(ar_text[index]);
                    tv_translation.setText(in_text[index]);
                    tv_sanad.setText(sn_text[index]);
                    tv_xx.setText(String.valueOf(index + 1));
                }
                break;

            //button speaker
            case R.id.b_speak:
                break;

            //button mute
        }
    }
}
