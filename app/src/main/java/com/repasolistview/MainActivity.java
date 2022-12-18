package com.repasolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ej_listview.InfoDescargaF;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<com.example.ej_listview.InfoDescargaF> facturas = new ArrayList<>();
        facturas.add(new InfoDescargaF("Diciembre", "2015", false));
        facturas.add(new InfoDescargaF("Noviembre", "2014", true));
        facturas.add(new InfoDescargaF("Septiembre", "2013", false));

        ListView lv = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this, R.layout.item, facturas);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                facturas.get(i).setDescargada(true);
                adapter.notifyDataSetChanged();
            }
        });

        lv.setAdapter(adapter);
    }
}