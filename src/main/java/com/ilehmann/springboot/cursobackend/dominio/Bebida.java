package com.ilehmann.springboot.cursobackend.dominio;


public class Bebida extends Producto{

    private double litros;

    public Bebida(int codigo, String nombre, String descripcion, double precioSinIva, double litros) {
        super(codigo, nombre, descripcion, precioSinIva);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public double getDetalle() {
        return this.litros;
    }

    @Override
    public void setDetalle(double detalle) {

    }
}
