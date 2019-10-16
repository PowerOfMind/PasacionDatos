package com.jjbarriga.pasaciondatos.utils;

import java.io.Serializable;

public class Personas implements Serializable {

    private String nombre;
    private int telefono;
    private boolean carnet;

    public Personas(String nombre, int telefono, boolean carnet) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isCarnet() {
        return carnet;
    }

    public void setCarnet(boolean carnet) {
        this.carnet = carnet;
    }
}

