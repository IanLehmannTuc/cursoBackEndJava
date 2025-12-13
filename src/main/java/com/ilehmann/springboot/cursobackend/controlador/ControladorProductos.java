package com.ilehmann.springboot.cursobackend.controlador;

import com.ilehmann.springboot.cursobackend.dominio.Mother;
import com.ilehmann.springboot.cursobackend.dominio.Procesador;
import com.ilehmann.springboot.cursobackend.dominio.Producto;
import com.ilehmann.springboot.cursobackend.dominio.ProductoDTO.ProductoDTO;
import com.ilehmann.springboot.cursobackend.dominio.ProductoDTO.ProductoMapper;
import com.ilehmann.springboot.cursobackend.servicios.ServicioProducto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ControladorProductos {

    private final ServicioProducto servicioProducto;
    private final ProductoMapper mapper;

    public ControladorProductos(ServicioProducto servicioProducto, ProductoMapper mapper) {
        this.servicioProducto = servicioProducto;
        this.mapper = mapper;
    }

    /*POST*/
    @PostMapping("/procesador")
    public Procesador crearProcedador(@RequestBody Procesador procesador){
        return this.servicioProducto.crearProcesador(procesador);
    }

    @PostMapping("/motherboard")
    public Mother crearMother(@RequestBody Mother mother){
        return this.servicioProducto.crearMother(mother);
    }

    /*GETS*/
    @GetMapping
    public List<ProductoDTO> mostrarAllProductos(@RequestParam(required = false) String name, @RequestParam(required = false) String marca){
        List<Producto> entidades = this.servicioProducto.getAllProductos(name, marca);
        return entidades.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> mostrarProductosById(@PathVariable Long id){
        Producto entidad = this.servicioProducto.getProductoById(id);
        if(entidad == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mapper.toDTO(entidad));
    }

    @PutMapping("/products/{id}")
    public Producto editProductbyId(@PathVariable Long id, @RequestBody Producto dataToEdit){
        return this.servicioProducto.modifDescripcionById(id, dataToEdit);
    }

    @DeleteMapping
    public Producto deleteProductoById(@PathVariable Long id){
        return this.servicioProducto.deleteProductoById(id);
    }

}
