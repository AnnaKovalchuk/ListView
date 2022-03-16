package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] colors = getResources().getStringArray(R.array.cat_names);

        // Связываемся с ListView
        ListView listView = findViewById(R.id.list);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, colors);

        // устанавливаем адаптер списку
        listView.setAdapter(adapter);

        // Обработка события на клик по элементу списка
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            ((TextView)findViewById(R.id.text)).setText(((TextView)view).getText());
            Toast.makeText(getApplicationContext(),((TextView)view).getText(), Toast.LENGTH_SHORT).show();
        });
}}