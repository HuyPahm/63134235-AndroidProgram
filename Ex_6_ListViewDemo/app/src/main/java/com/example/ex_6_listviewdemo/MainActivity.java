package com.example.ex_6_listviewdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsl;
        dsl = new ArrayList<String>();
        dsl.add("Chúng ta của tương lai");
        dsl.add("Chúng ta của hiện tại");
        dsl.add("Chúng ta của sau này");
        ArrayAdapter<String> adapterlist;
        adapterlist = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsl);
        ListView lv= findViewById(R.id.ds);
        lv.setAdapter(adapterlist);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}