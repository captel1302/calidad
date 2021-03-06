package com.example.abel.houston.entity;

public class Canje {

    private String urlCanje;
    private String nombre;
    private String info;
    private int foto;

    public Canje() {

    }

    public Canje(String nombre, String info,String urlCanje,int foto) {
        this.nombre = nombre;
        this.info = info;
        this.urlCanje = urlCanje;
        this.foto = foto;
    }

    public String getUrlCanje() {
        return urlCanje;
    }

    public void setUrlCanje(String urlCanje) {
        this.urlCanje = urlCanje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
