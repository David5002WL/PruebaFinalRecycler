package com.example.david.pruebafinalrecycler;

/**
 * Created by David on 30/01/2018.
 */

public class Usuario {
    private int foto;
    private String nombre;

    public Usuario(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
