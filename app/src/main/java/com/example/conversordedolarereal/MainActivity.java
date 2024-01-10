package com.example.conversordedolarereal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Aqui vai o meu código fonte :

    public void converter(View view){
        EditText editDolar;
        TextView txtResultado;

        editDolar = findViewById(R.id.editDolar);
        txtResultado = findViewById(R.id.txtResultado);

        Double valorSolar = Double.parseDouble(editDolar.getText().toString());
        Double valorConvertido = valorSolar * 5;
        txtResultado.setText("Valor Convertido em Reais: R$ " + valorConvertido);
    }

}