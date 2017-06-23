package com.example.pedrodaluz.smartcharger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_guardar = (Button) findViewById(R.id.btn_salvar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this,Tela_Principal.class);
                startActivity(intent);

                //setContentView(R.layout.activity_tela__principal);
            }
        });
    }
}