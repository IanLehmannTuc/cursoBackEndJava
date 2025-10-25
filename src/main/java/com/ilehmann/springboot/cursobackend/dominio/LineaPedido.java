package com.ilehmann.springboot.cursobackend.dominio;

public class LineaPedido {
    private Producto producto;
    private int cantidad;
    private double precioTotalSinIva;

    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotalSinIva = producto.getPrecioSinIva() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotalSinIva() {
        return precioTotalSinIva;
    }
}
