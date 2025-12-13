package com.ilehmann.springboot.cursobackend.repositorio;

import com.ilehmann.springboot.cursobackend.dominio.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPedidos extends CrudRepository<Pedido, Long> {

}
