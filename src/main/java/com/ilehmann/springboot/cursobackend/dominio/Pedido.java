package com.ilehmann.springboot.cursobackend.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    //private List<LineaPedido> linea = new ArrayList<>();
    private double CostoTotal;

    public Pedido() {
    }

    public Pedido(double costoTotal) {
        CostoTotal = costoTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /*public List<LineaPedido> getLinea() {
        return linea;
    }*/

    /*public void setLinea(List<LineaPedido> linea) {
        this.linea = linea;
    }*/
}
