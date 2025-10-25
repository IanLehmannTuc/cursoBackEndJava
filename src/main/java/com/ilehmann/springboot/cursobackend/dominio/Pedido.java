package com.ilehmann.springboot.cursobackend.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigo;
    private List<LineaPedido> linea = new ArrayList<>();
    private double CostoTotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<LineaPedido> getLinea() {
        return linea;
    }

    public void setLinea(List<LineaPedido> linea) {
        this.linea = linea;
    }
}
