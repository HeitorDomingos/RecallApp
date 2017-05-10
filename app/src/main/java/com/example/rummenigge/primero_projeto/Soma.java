package com.example.rummenigge.primero_projeto;

import android.content.SyncStatusObserver;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Soma extends AppCompatActivity {

    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
    }

    public void soma(View view){
        editText1 = (EditText) findViewById(R.id.editText1);
        int primeiroNum = Integer.parseInt(editText1.getText().toString());

        editText2 = (EditText) findViewById(R.id.editText2);
        int segundoNum = Integer.parseInt(editText2.getText().toString());

        int resultado = primeiroNum + segundoNum;

        Toast.makeText(this, "Resultado : " + resultado, Toast.LENGTH_LONG).show();

    }

    }
}
