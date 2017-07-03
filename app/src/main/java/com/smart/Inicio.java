package com.smart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.pedrodaluz.smartcharger.R;
import com.smart.Dao.Dao;
import com.smart.bean.Usuario;

public class Inicio extends  Comum {



    TextView setas;
    public static final long TEMPO_DE_ESPERA = (8000);
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tela_inicio);
        setas = (TextView) findViewById(R.id.setas);
        setas.setOnClickListener(this);
        inicializacao();

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Inicio.this, Login.class);
        Inicio.this.startActivity(intent);
        Inicio.this.finish();
    }

    public void espera(){

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(isUser()) {
                    Intent intent = new Intent(Inicio.this, Login.class);
                    intent.putExtra("usuario",usuario);
                    Inicio.this.startActivity(intent);
                    Inicio.this.finish();
                }else{
                    Intent intent = new Intent(Inicio.this, Conta.class);
                    Inicio.this.startActivity(intent);
                    Inicio.this.finish();
                }

            }

        }, TEMPO_DE_ESPERA );

    }

    public void inicializacao(){
        RelativeLayout layout = (RelativeLayout)findViewById(R.id.telaInicio);
        layout.setBackgroundResource(R.drawable.bg4);
        espera();

    }
    // busca usuario na base de dados se ja tiver feito login
    private boolean isUser(){

        Dao dao = new Dao();
        usuario = dao.getUser();

        //if(usuario!= null) usuario.setPhoto(getResources().getDrawable(Integer.parseInt(prefixo)));

        return usuario!= null ? true: false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        espera();
    }



}
