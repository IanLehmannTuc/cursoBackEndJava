package com.ilehmann.springboot.cursobackend.dominio.ProductoDTO;

import lombok.Data;

@Data
public class ProductoDTO{
    private Long idProducto;
    private String nombre;
    private String descripcion;
    private double precioSinIva;
    private String nombreMarca; // <--- Aquí guardaremos solo el nombre "Asus" o "AMD"
    private String tipoProducto;
}
