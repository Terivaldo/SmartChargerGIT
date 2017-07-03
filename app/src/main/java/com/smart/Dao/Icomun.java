package com.smart.Dao;

import com.smart.bean.Usuario;

/**
 * Created by skoop on 7/3/2017.
 * Adicione nesta classe os metodos que achar necessario para a interação com a base de dados
 */

public interface Icomun {

    public Usuario getUser();

    public boolean removerUsuario(Usuario usuario);

    public boolean removerContactoAmigo(Usuario usuario);

}
