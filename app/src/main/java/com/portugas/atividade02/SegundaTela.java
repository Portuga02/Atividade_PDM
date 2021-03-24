package com.portugas.atividade02;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class SegundaTela  extends Activity {
    TextView campoNome;
    TextView campoEndereco;
    TextView campoTelefone;
    TextView campoEmail;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        campoNome = (TextView)findViewById(R.id.id_nome);
        campoEndereco = (TextView)findViewById(R.id.id_endereco);
        campoTelefone = (TextView)findViewById(R.id.id_telefone);
        campoEmail = (TextView)findViewById(R.id.id_email);

        String valor = getIntent().getStringExtra("Nome");

        campoNome.setText(valor);
    }
}
