package com.ilehmann.springboot.cursobackend.dominio.repositorio;

import com.ilehmann.springboot.cursobackend.dominio.Producto;

import java.util.ArrayList;

public class RepositorioProducto {

    public static RepositorioProducto instanciaRepo = null;
    private ArrayList<Producto> repo;

    private RepositorioProducto() {
        repo = new ArrayList<>();
    }

    public static RepositorioProducto repositorioProducto() {
        if(instanciaRepo == null){
            instanciaRepo = new RepositorioProducto();
        }
        return instanciaRepo;
    }

    public ArrayList<Producto> getAll() {
        return repo;
    }

    public Producto getProducto(int codigo) {
        for(Producto p : repo) {
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        System.out.println("No se encontro el producto con el codigo " + codigo);
        return null;
    }

    public boolean addProducto(Producto producto) {
        for (Producto p : repo) {
            if(p.getCodigo() == producto.getCodigo()) {
                System.out.println("El producto " + producto.getNombre() +
                        " con codigo " + producto.getCodigo() + " ya se encuentra guardado");
                return false;
            }
        }
        repo.add(producto);
        return true;
    }

    public void modifProducto(Producto producto) {
        for(Producto p : repo) {
            p.setNombre(producto.getNombre());
            p.setDescripcion(producto.getDescripcion());
            p.setCodigo(producto.getCodigo());
            p.setPrecioSinIva(producto.getPrecioSinIva());
            p.setDetalle(producto.getDetalle());
        }
    }

    public boolean deleteProducto(int codigo) {
        for (Producto p : repo) {
            if(p.getCodigo() == codigo) {
                repo.remove(p);
                System.out.println("El producto " + p.getNombre() + " con codigo " + p.getCodigo() + " ha sido eliminado");
                return true;
            }
        }
        System.out.println("No se encontro el producto con el codigo " + codigo);
        return false;
    }



}
