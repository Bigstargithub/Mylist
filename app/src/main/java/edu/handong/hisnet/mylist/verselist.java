package edu.handong.hisnet.mylist;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipFile;


public class verselist extends AppCompatActivity {

    static String bibleformat;
    ArrayList<String> items = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verselist);

        Intent intent = getIntent();
        String verseNumber = ((MainActivity.BibleNumber) < 9 ? "0" : "") +
                String.valueOf(MainActivity.BibleNumber+1);
        String verseofnum = intent.getExtras().getString("versenum");
        //File optimizedFile = new File()
       // String hgu = MainActivity.DataRoot + File.separator
       //         + "korhrv"+ File.separator + "korhrv" +verseNumber + "_" + verseofnum + ".lfb";
       // TextView te = (TextView) findViewById(R.id.textView3);
        //te.setText(hgu);

        File optimizedFile = new File(MainActivity.DataRoot + File.separator
                                        + "korhrv.zip");

        File file = new File(MainActivity.DataRoot + File.separator
                + "korhrv"+ File.separator + "korhrv" +verseNumber + "_" + verseofnum + ".lfb");

        ListView listview2 = (ListView) findViewById(R.id.verselist);



        FileReader fr = null;
        char[] cbuf = new char[512];
        String str;
        int size;
        if(file.exists()) {


            try {

                fr = new FileReader(file);
                BufferedReader bufrd = new BufferedReader(fr);

                while((str = bufrd.readLine()) != null)
                {
                        if(Integer.parseInt(verseofnum)<10){
                            items.add(str.substring(6));
                        }
                        else{
                            items.add(str.substring(7));
                        }



                }

                bufrd.close();
                fr.close();
                ArrayAdapter adapter2 = new ArrayAdapter(this,
                        android.R.layout.simple_list_item_1,items);
                listview2.setAdapter(adapter2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
