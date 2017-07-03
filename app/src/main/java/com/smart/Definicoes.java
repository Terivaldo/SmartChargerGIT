package com.smart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pedrodaluz.smartcharger.R;

public class Definicoes extends Comum {

    TextView addContact;
    TextView addToques;
    TextView editarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_defincoes);

        addContact = (TextView) findViewById(R.id.addContact);

        addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Definicoes.this, Contacto.class);
                startActivity(intent);
                //setContentView(R.layout.tela_principal);
            }
        });

        addToques = (TextView) findViewById(R.id.addToques);

        addToques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Definicoes.this, PersonalizarToques.class);
                startActivity(intent);
                //setContentView(R.layout.tela_principal);
            }


        });

        editarConta = (TextView) findViewById(R.id.editarConta);

        editarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Definicoes.this, Conta.class);
                startActivity(intent);
                //setContentView(R.layout.tela_principal);
            }


        });

    }
}
