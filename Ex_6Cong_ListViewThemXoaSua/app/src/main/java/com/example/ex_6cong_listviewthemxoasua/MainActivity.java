package com.example.ex_6cong_listviewthemxoasua;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvnhac;
    Button button;
    Button button2;
    EditText editTextName;
    ArrayList<String> arrayCourse;
    int vitri = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lvnhac = (ListView) findViewById(R.id.lvnhac);
        button = (Button) findViewById(R.id.button1);
        button = (Button) findViewById(R.id.button2);

        editTextName = (EditText) findViewById(R.id.editTextName);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayAdapter adapter = new ArrayAdapter<>(
                MainActivity.this, android.R.layout.simple_list_item_1,arrayCourse
        );
        lvnhac.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                String nhac = editTextName.getText().toString();
                arrayCourse.add(nhac);
                adapter.notifyDataSetChanged();
            }
        });
        lvnhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editTextName.setText(arrayCourse.get(i));
                vitri =i;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    arrayCourse.set(vitri, editTextName.getText().toString());
                    adapter.notifyDataSetChanged();
            }
        });
        lvnhac.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
                arrayCourse.remove(i);
                adapter.notifyDataSetChanged();

                return false;
            }
        });
    }
}