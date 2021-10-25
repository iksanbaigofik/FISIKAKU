package com.example.konvertsuhu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnConvertTemp, btnSijine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConvertTemp = findViewById(R.id.btn_convert_temp);
        btnSijine = findViewById(R.id.btn_opo);

        btnConvertTemp.setOnClickListener(v -> {
            Intent intent = new Intent(this, ConvertTempActivity.class);
            startActivity(intent);
        });

        btnSijine.setOnClickListener(v -> {
            Intent intent = new Intent(this, LayarSijineActivity.class);
            startActivity(intent);
        });
    }


}