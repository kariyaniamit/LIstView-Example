package com.example.listview_fruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList mobiles=new ArrayList<String>();

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobiles.add("Android");
        mobiles.add("IPhone");
        mobiles.add("WindowsMobile");
        mobiles.add("Blackberry");
        mobiles.add("WebOS");
        mobiles.add("Ubuntu");


        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.fruit, mobiles);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Item Clicked:"+ adapter.getItem(i),Toast.LENGTH_LONG).show();
            }
        });
    }
}