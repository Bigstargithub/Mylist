package edu.handong.hisnet.mylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class verselist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verselist);

        Intent intent = getIntent();
        String verseofnum = intent.getExtras().getString("versenum");
        //File optimizedFile = new File()
        TextView te = (TextView) findViewById(R.id.textView3);
        te.setText(verseofnum);
    }
}
