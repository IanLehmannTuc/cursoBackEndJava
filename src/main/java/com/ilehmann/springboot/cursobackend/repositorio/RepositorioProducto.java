package com.ilehmann.springboot.cursobackend.repositorio;

import com.ilehmann.springboot.cursobackend.dominio.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Long> {

    List<Producto> findAll();

    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    List<Producto> findByMarcaNombreContaining(String marca);
    List<Producto> findByNombreContainingIgnoreCaseAndMarcaNombreContainingIgnoreCase(String nombre, String marca);


}
