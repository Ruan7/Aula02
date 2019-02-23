package br.com.ifsc.ddm.geradornumerosaleatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alteraTexto(View view) {

       Random numeroRandom = new Random();

       TextView text = (TextView) findViewById(R.id.textView6);
       TextView texto1 = findViewById(R.id.editText2);
       TextView texto2 = findViewById(R.id.editText3);

       int a = Integer.parseInt(texto1.getText().toString());
       int b = Integer.parseInt(texto2.getText().toString());

       int randomNum =  ((int)(a + Math.random() * (b - a + 1)));

       String valor = String.valueOf(randomNum);

       text.setText(valor);
    }
}
