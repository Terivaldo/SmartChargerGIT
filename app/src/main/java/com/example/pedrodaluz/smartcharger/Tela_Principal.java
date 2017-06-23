package com.example.pedrodaluz.smartcharger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela_Principal extends AppCompatActivity {

    Button definicoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__principal);

        /*definicoes = (Button) findViewById(R.id.Btn_definicoes);

        definicoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent intent = new Intent(Tela_Principal.this,Tela_defincoes.class);
               // startActivity(intent);

                setContentView(R.layout.activity_tela__principal);
            }
        });*/
    }
}