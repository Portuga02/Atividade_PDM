package com.portugas.atividade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btChamaNovaTela;
    EditText campoNome;
    EditText campoEndereco;
    EditText campoTelefone;
    EditText campoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = (EditText) findViewById(R.id.id_nome);
        campoEndereco = (EditText) findViewById(R.id.id_endereco);
        campoTelefone = (EditText) findViewById(R.id.id_telefone);
        campoEmail = (EditText) findViewById(R.id.id_email);
        btChamaNovaTela = (Button) findViewById(R.id.btChamaNovaTela);
        btChamaNovaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                intent.putExtra("Nome", campoNome.getText().toString());
                intent.putExtra("Endereco", campoNome.getText().toString());
                intent.putExtra("Telefone", campoNome.getText().toString());
                intent.putExtra("Email", campoNome.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}