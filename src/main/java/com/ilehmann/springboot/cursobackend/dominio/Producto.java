package com.ilehmann.springboot.cursobackend.dominio;


public abstract class Producto {
    private int codigo;
    private String nombre;
    private int Stock;
    private String descripcion;
    private double precioSinIva;

    public Producto(int codigo, String nombre, String descripcion, double precioSinIva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Stock = 50;
        this.descripcion = descripcion;
        this.precioSinIva = precioSinIva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public abstract double getDetalle();
    public abstract void setDetalle(double detalle);

}
