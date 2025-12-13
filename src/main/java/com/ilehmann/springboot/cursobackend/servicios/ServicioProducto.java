package com.ilehmann.springboot.cursobackend.servicios;

import com.ilehmann.springboot.cursobackend.dominio.Mother;
import com.ilehmann.springboot.cursobackend.dominio.Procesador;
import com.ilehmann.springboot.cursobackend.dominio.Producto;
import com.ilehmann.springboot.cursobackend.repositorio.RepositorioProducto;
import com.ilehmann.springboot.cursobackend.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioProducto {

    private final RepositorioProducto repositorioProducto;
    private  final StringUtils stringUtils;

    public ServicioProducto(RepositorioProducto repositorioProducto, StringUtils stringUtils) {
        this.repositorioProducto = repositorioProducto;
        this.stringUtils = stringUtils;
    }

    public Procesador crearProcesador(Procesador procesador) {
        System.out.println("Producto creado: " + procesador);
        return this.repositorioProducto.save(procesador);
    }

    public Mother crearMother(Mother mother){
        System.out.println("Mother creado: " + mother);
        return this.repositorioProducto.save(mother);
    }

    public Producto getProductoById(Long id) {
        Optional<Producto> productoOptional = this.repositorioProducto.findById(id);
        if (productoOptional.isEmpty()) {
            throw new RuntimeException("No se encontro el producto con id " + id);
        }
        return productoOptional.get();
    }

    public List<Producto> getAllProductos(String name, String marca) {
        boolean tieneNombre = name != null && !name.isEmpty();
        boolean tieneMarca = marca != null && !marca.isEmpty();

        if (tieneNombre && tieneMarca) {
            return this.repositorioProducto.findByNombreContainingIgnoreCaseAndMarcaNombreContainingIgnoreCase(name, marca);
        }
        if (tieneNombre) {
            return this.repositorioProducto.findByNombreContainingIgnoreCase(name);
        }
        if (tieneMarca) {
            return this.repositorioProducto.findByMarcaNombreContaining(marca);
        }
        return this.repositorioProducto.findAll();
    }

    public Producto modifDescripcionById(Long id, Producto dataToEdit){
        Producto producto = this.getProductoById(id);

        if(stringUtils.isEmpty(dataToEdit.getNombre())){
            producto.setNombre(dataToEdit.getNombre());
        }

        return this.repositorioProducto.save(producto);
    }

    public Producto deleteProductoById(Long id){
        Producto producto = this.getProductoById(id);

        this.repositorioProducto.delete(producto);

        return producto;
    }

}
