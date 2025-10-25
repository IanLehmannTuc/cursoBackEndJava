package com.ilehmann.springboot.cursobackend.servicios;

import com.ilehmann.springboot.cursobackend.dominio.Producto;
import com.ilehmann.springboot.cursobackend.dominio.ProductoDTO.ProductoDTO;
import com.ilehmann.springboot.cursobackend.dominio.repositorio.RepositorioProducto;

public class ServicioModificarProducto {

    private static ServicioModificarProducto instanciaModProducto = null;
    private int codigo;
    private int opcion;
    private Producto producto;
    private ProductoDTO dto;
    private RepositorioProducto repo = RepositorioProducto.repositorioProducto();

    private ServicioModificarProducto() {}

    public static ServicioModificarProducto servicioModificarProducto() {
        if(instanciaModProducto == null){
            instanciaModProducto = new ServicioModificarProducto();
        }
        return instanciaModProducto;
    }

    public void modificarProducto() {
        System.out.println("Ingrese el codigo del producto: ");
        codigo = ServicioMenu.sc.nextInt();
        producto = repo.getProducto(codigo);
        if(producto != null){
            System.out.println("Que desea modificar?\n" +
                    "1- Nombre\n" +
                    "2- Descripcion\n" +
                    "3- Litro/Peso\n" +
                    "4- Stock\n" +
                    "5- Precio");
            opcion = ServicioMenu.sc.nextInt();
            switch(opcion){
            }
        };
    }



}
