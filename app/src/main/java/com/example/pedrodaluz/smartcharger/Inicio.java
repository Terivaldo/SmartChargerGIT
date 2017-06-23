package com.example.pedrodaluz.smartcharger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    Button botao_inciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        botao_inciar = (Button) findViewById(R.id.botao_inciar);

        botao_inciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Inicio.this, Login.class);
                startActivity(intent);

                //setContentView(R.layout.activity_login);
            }
        });
    }
}
