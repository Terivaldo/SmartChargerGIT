package com.smart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pedrodaluz.smartcharger.R;


public class Principal extends  Comum {

    ImageButton btnDefinicoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        registraEventos();
    }

   @Override
   public void registraEventos(){
       btnDefinicoes = (ImageButton) findViewById(R.id.btnDefinicoes);
       btnDefinicoes.setOnClickListener(this);

   }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDefinicoes:

                Intent intent = new Intent(Principal.this, Definicoes.class);
                startActivity(intent);
                mudarDeTela();
                break;
        }

    }

    public void mudarDeTela(){

        Intent intent = new Intent(Principal.this, Definicoes.class);
        startActivity(intent);
    }


}
