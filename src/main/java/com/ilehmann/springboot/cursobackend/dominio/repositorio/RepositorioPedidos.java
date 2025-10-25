package com.ilehmann.springboot.cursobackend.dominio.repositorio;

import com.ilehmann.springboot.cursobackend.dominio.Pedido;
import com.ilehmann.springboot.cursobackend.dominio.Producto;
import java.util.ArrayList;

public class RepositorioPedidos {

    private ArrayList<Pedido> repo;

    public RepositorioPedidos() {
        repo = new ArrayList<>();
    }

    public ArrayList<Pedido> getAll() {
        return repo;
    }

    public Pedido getPedido(int codigo) {
        for(Pedido p : repo) {
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        System.out.println("No se encontro el Pedido con el codigo " + codigo);
        return null;
    }

    public boolean addPedido(Pedido pedido) {
        for (Pedido p : repo) {
            if(p.getCodigo() == pedido.getCodigo()) {
                System.out.println("El Pedido  con codigo " + pedido.getCodigo() + " ya se encuentra guardado");
                return false;
            }
        }
        repo.add(pedido);
        System.out.println("El Pedido  con codigo " + pedido.getCodigo() + " guardado");
        return true;
    }

}
