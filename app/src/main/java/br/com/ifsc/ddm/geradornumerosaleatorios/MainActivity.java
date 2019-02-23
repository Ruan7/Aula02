package br.com.ifsc.ddm.geradornumerosaleatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alteraTexto(View view) {

       TextView text = (TextView) findViewById(R.id.text);
        TextView texto = findViewById(R.id.editText2);

        text.setText(texto.getText());
    }
}
