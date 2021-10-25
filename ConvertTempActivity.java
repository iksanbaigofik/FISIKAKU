package com.example.konvertsuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConvertTempActivity extends AppCompatActivity  {
    TextView hasil;
    EditText suhu;
    Spinner spinner;
    Button btn_konversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_temp);

        suhu = (EditText) findViewById(R.id.et_suhu);
        spinner = findViewById(R.id.spinner_temp);
        hasil = findViewById(R.id.tv_hasil);
        btn_konversi = (Button) findViewById(R.id.btn_konvert);
    }

    public void konversisuhu (View view){
        try{
            if (suhu.getText().toString().equals("")){
                hasil.setText("ERROR");
                return;
            }
            float tempValue = Float.parseFloat(suhu.getText().toString());
            int item = spinner.getSelectedItemPosition();
            switch (item) {
                case 0:
                    hasil.setText("Kelvin : " + (tempValue + 273.15) + "\n" +
                            "Fahrenheit : " + (tempValue * 9 / 5 + 32) + "\n" +
                            "Reamur : " + (tempValue * 4 / 5));
                    break;
                case 1:
                    hasil.setText("Celcius : " + (tempValue - 273.15) + "\n" +
                            "Fahrenheit : " + ((tempValue - 273.15) * 9 / 5 + 32) + "\n" +
                            "Reamur : " + ((tempValue - 273.15) * 4 / 5));
                    break;
                case 2:
                    hasil.setText("Celcius : " + ((tempValue - 32) * 5 / 9) + "\n" +
                            "Kelvin : " + ((tempValue - 32) * 5 / 9 + 273.15) + "\n" +
                            "Reamur : " + ((tempValue - 32) * 4 / 9));
                    break;
                case 3:
                    hasil.setText("Celcius : " + (tempValue * 5 / 4) + "\n" +
                            "Kelvin : " + ((tempValue + 273.15) * 5 / 4) + "\n" +
                            "Fahrenheit : " + ((tempValue + 32) * 9 / 4));
                    break;
                default:
                    hasil.setText("ERROR");
                    break;
            }
        }catch (Exception e){
            hasil.setText("BUKAN ANGKA GBLG");
            e.printStackTrace();
        }
    }

    public void keluar (View view) {
        finish();
    }
}