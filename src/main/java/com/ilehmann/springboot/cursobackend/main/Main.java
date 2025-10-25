package com.ilehmann.springboot.cursobackend.main;

import com.ilehmann.springboot.cursobackend.dominio.repositorio.RepositorioProducto;
import com.ilehmann.springboot.cursobackend.servicios.ServicioMenu;

public class Main {

    public static void main(String[] args) {

        RepositorioProducto repositorioProducto = RepositorioProducto.repositorioProducto();
        ServicioMenu inicio = new ServicioMenu();
        inicio.mostrarMenu();
    }

}
