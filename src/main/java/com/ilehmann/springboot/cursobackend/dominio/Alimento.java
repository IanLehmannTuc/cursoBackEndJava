package com.ilehmann.springboot.cursobackend.dominio;


public class Alimento extends Producto{

    private double pesoGr;

    public Alimento(int codigo, String nombre, String descripcion, double precioSinIva,double pesoGR) {
        super(codigo, nombre, descripcion, precioSinIva);
        this.pesoGr = pesoGr;
    }

    @Override
    public double getDetalle() {
        return this.pesoGr;
    }

    @Override
    public void setDetalle(double detalle) {

    }

    public void setPesoGr(double pesoGr) {
        this.pesoGr = pesoGr;
    }
}
