package com.smart.bean;


import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.List;

public class Usuario  implements Serializable{

    private int id;
    private String nome;
    private String senha;
    private Drawable photo;
    private String contacto;
    private List<Usuario> listaDeamigos;

    public Usuario(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Usuario> getListaDeamigos() {
        return listaDeamigos;
    }

    public void setListaDeamigos(List<Usuario> listaDeamigos) {
        this.listaDeamigos = listaDeamigos;
    }
}
