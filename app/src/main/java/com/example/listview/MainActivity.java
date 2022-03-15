package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] colors =getResources().getStringArray(R.array.cat_names);

        // Связываемся с ListView
        ListView listView = findViewById(R.id.list);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, colors);

        // устанавливаем адаптер списку
        listView.setAdapter(adapter);

        // Обработка события на клик по элементу списка
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(),
                        ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}