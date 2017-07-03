package com.smart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pedrodaluz.smartcharger.R;

public class Login extends  Comum {

    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        //Gravar();
        mudarDeTela();
    }

    public void mudarDeTela(){

        btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Login.this, Principal.class);
                startActivity(intent);
            }
        });
    }
}
