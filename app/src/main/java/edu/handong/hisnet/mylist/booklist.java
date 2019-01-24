package edu.handong.hisnet.mylist;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class booklist extends AppCompatActivity {

    static TextView versenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        int MAX_ROW_NUMBER = 5;
        int Verse = MainActivity.VerseNum/MAX_ROW_NUMBER;
        setContentView(R.layout.activity_booklist);
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.bibletable);
        for(int i=0;i<Verse;i++)
        {
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));

            for(int j=1;j<6;j++)
            {
                TextView textView = new TextView(this);
                textView.setText(""+(j+i*MAX_ROW_NUMBER));
                textView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT));
                textView.setGravity(Gravity.CENTER_HORIZONTAL);
                tableRow.addView(textView);
                textView.setOnClickListener(getOnClickListener());
                Intent intent2 = getIntent();
                MainActivity.BibleNumber = intent2.getExtras().getInt("bibleNumber");

            }

            tableLayout.addView(tableRow);
        }

        TextView biblename2 = (TextView) findViewById(R.id.textView2);
        biblename2.setText(MainActivity.biblename);



    }

    View.OnClickListener getOnClickListener(){

        return new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                String chapter = ((TextView)v).getText().toString();
                Intent i = new Intent(booklist.this, verselist.class);
                i.putExtra("versenum",chapter);
                startActivity(i);
            }
        };
    }
}


