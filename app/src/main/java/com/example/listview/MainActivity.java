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
    // элементы списка которые будут в него внесены
    String[] colors = { "Красный", "Оранжевый", "Желтый", "Зелёный", "Голубой", "Синий", "Фиолетовый"};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Связываемся с ListView
        ListView list = (ListView) findViewById(R.id.list);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, colors);

        // устанавливаем адаптер списку
        list.setAdapter(adapter);

        // Обработка события на клик по элементу списка
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(),
                        ((TextView)view).getText(), Toast.LENGTH_LONG).show();
                ((TextView)findViewById(R.id.text)).setText(((TextView)view).getText());
            }
        });
    }
}