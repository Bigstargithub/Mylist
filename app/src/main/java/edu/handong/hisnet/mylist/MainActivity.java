package edu.handong.hisnet.mylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static final String[] LIST_MENU = {"창세기","출애굽기","레위기","민수기","신명기","여호수아","사사기",
                                       "룻기","사무엘상","사무엘하","열왕기상","열왕기하","역대상","역대하",
                                       "에스라","느헤미야","에스더","욥기","시편","잠언","전도서","아가",
                                       "이사야","예레미야","예레미야애가","에스겔","다니엘","호세아","요엘",
                                       "아모스","오바댜","요나","미가","나훔","하박국","스바냐","학개","스가랴",
                                       "말라기","마태복음","마가복음","누가복음","요한복음","사도행전","로마서",
                                       "고린도전서","고린도후서","갈라디아서","에베소서","빌립보서","골로새서",
                                       "데살로니가전서","데살로니가후서","디모데전서","디모데후서","디도서",
                                       "빌레몬서","히브리서","야고보서","베드로전서","베드로후서","요한1서",
                                       "요한2서","요한3서","유다서","요한계시록"};
    //private ArrayList<HashMap<String,String>> Data = new ArrayList<HashMap<String, String>>();
    //private HashMap<String,String> InputData1 = new HashMap<>();
   // private HashMap<String,String> InputData2 = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,LIST_MENU);

        ListView listView = (ListView) findViewById(R.id.List_view);
        listView.setAdapter(adapter);
        //데이터 초기화
        /*InputData1.put("school","서울대");
        InputData1.put("name","유혁");
        Data.add(InputData1);

        InputData2.put("school","연세대");
        InputData2.put("name", "유재석");
        Data.add(InputData2);

        //simpleAdapter 생성
        SimpleAdapter simpleAdapter = new
                SimpleAdapter(this,Data,android.R.layout.simple_list_item_1,
                ,new int[]{android.R.id.text1,android.R.id.text2});
        listView.setAdapter(simpleAdapter);
*/

    }
}
