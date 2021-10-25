package com.example.fisikakumudah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConvertSuhu extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_suhu);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Kebun Binatang Sang Kulim","Perpustakaan Soeman H.S","Taman Agrowisata Tenayan Raya","ASIA FARM HAYDAY", "Taman Budaya Provinsi Riau","Rumah Jamur Nando","Rumah Singgah Tuan Kadi","Museum Daerah Riau Sang Nila Utama","Agrowisata SCW Tenayan Raya","Lapangan Purna MTQ Pekanbaru","Taman Pendidikan Al - Quran (TPA/TPQ) Baitul Arsy"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), KebunBinatang.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Pustaka.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}