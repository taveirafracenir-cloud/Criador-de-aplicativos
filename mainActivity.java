package com.criadorapps;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Carrega a biblioteca nativa
    static {
        System.loadLibrary("native-lib");
    }

    // Função nativa em C++
    public native String getNativeFunction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitle = findViewById(R.id.tvTitle);
        Button btnAddFunction = findViewById(R.id.btnAddFunction);
        Button btnGenerateApp = findViewById(R.id.btnGenerateApp);
        TextView tvResult = findViewById(R.id.tvResult);

        btnAddFunction.setOnClickListener(v -> {
            // Aqui você pode adicionar funções personalizadas
            tvResult.setText("Função adicionada!");
        });

        btnGenerateApp.setOnClickListener(v -> {
            // Chama a função nativa C++
            String result = getNativeFunction();
            tvResult.setText("App gerado com função nativa: " + result);
        });
    }
}
