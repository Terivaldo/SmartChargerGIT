package com.smart.Dao;

import com.smart.bean.Usuario;

/**
 * Created by skoop on 7/3/2017.
 */

public class Dao implements  Icomun{


    public Dao() {

    }


    public Usuario getUser() {

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("Mabiala");
        usuario.setSenha("123455");

        return usuario;
    }

    public boolean removerUsuario(Usuario usuario) {
        return false;

    }

    public boolean removerContactoAmigo(Usuario usuario) {
        return false;
    }

}
