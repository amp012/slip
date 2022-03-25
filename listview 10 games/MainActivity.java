package com.example.listview10games;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    // Array of strings...
    ListView simpleList;
    String games[] = {"Cricket", "Football", "basketball", "table-tennis", "hockey", "tennis", "rugby", "kabaddi", "gaming", "running" };

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, games);
        simpleList.setAdapter(arrayAdapter);
    }
}