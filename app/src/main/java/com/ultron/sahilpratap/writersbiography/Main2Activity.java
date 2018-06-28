package com.ultron.sahilpratap.writersbiography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String writer[];
    TextView e1,e2,e3,e4,e5,e6,e7;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.textView2);
        e2 = findViewById(R.id.textView4);
        e3 = findViewById(R.id.textView6);
        e4 = findViewById(R.id.textView9);
        e5 = findViewById(R.id.textView11);
        e6 = findViewById(R.id.textView13);
        e7 = findViewById(R.id.textView16);
        img = findViewById(R.id.imageView);

         int varNo = getIntent().getIntExtra("position_key",0);
         int writers[] = {R.array.Writer_0,R.array.Writer_1,R.array.Writer_2,R.array.Writer_3,R.array.Writer_4,R.array.Writer_5,R.array.Writer_6,R.array.Writer_7,R.array.Writer_8,R.array.Writer_9};
         int imgs[] = {R.drawable.amrita,R.drawable.rabindranath_tagore,R.drawable.padma,R.drawable.sarojini,R.drawable.r_k_narayan,R.drawable.kabir,R.drawable.jk,R.drawable.william,R.drawable.benjamin,R.drawable.charles};

         writer = getResources().getStringArray(writers[varNo]);
         img.setImageResource(imgs[varNo]);

         e1.setText(writer[0]);
         e2.setText(writer[1]);
         e3.setText(writer[2]);
         e4.setText(writer[3]);
         e5.setText(writer[4]);
         e6.setText(writer[5]);
         e7.setText(writer[6]);



    }
}
