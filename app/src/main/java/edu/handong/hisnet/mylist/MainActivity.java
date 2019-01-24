package edu.handong.hisnet.mylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    static int BibleNumber;

    public static final int[] numOfChapters ={50,40,27,36,34,24,21,4,31,24,
            22,25,29,36,10,13,10,42,150,31,
            12,8,66,52,5,48,12,14,3,9,
            1,4,7,3,3,3,2,14,4,
            28,16,24,21,28,16,16,13,6,6,
            4,4,5,3,6,4,3,1,13,5,
            5,3,5,1,1,1,22};
    static int VerseNum;
    public static String biblename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BibleList를 ArrayAdapter에 넣는다.
        final String[] Biblelist = getResources().getStringArray(R.array.Biblelist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Biblelist);

        // ListView의 constructor를 만든다.
        final ListView listView = (ListView) findViewById(R.id.List_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                VerseNum = numOfChapters[i];
                biblename = Biblelist[i];

                Intent intent = new Intent(MainActivity.this, booklist.class);
                intent.putExtra("bibleNumber",i);
                startActivity(intent);

                }
        });
        listView.setAdapter(adapter);




    }
}




