package com.ilehmann.springboot.cursobackend.servicios;

import com.ilehmann.springboot.cursobackend.dominio.Alimento;
import com.ilehmann.springboot.cursobackend.dominio.Bebida;
import com.ilehmann.springboot.cursobackend.dominio.Enum.ProductoEnum;
import com.ilehmann.springboot.cursobackend.dominio.Producto;
import com.ilehmann.springboot.cursobackend.dominio.ProductoDTO.ProductoDTO;
import com.ilehmann.springboot.cursobackend.dominio.repositorio.RepositorioProducto;

public class ServicioAgregarProducto {

    private static ServicioAgregarProducto instanciaAddProducto = null;
    private int tipo; //1- bebida, 2- alimento
    private boolean bandera = true;
    private Producto producto;
    private ProductoDTO dto;
    private RepositorioProducto repo = RepositorioProducto.repositorioProducto();

    private ServicioAgregarProducto() {}

    public static ServicioAgregarProducto servicioAgregarProducto() {
        if(instanciaAddProducto == null){
            instanciaAddProducto = new ServicioAgregarProducto();
        }
        return instanciaAddProducto;
    }

    public void agregarProducto() {
        dto = new ProductoDTO();
        while(bandera) {
            System.out.println("El producto es: " +
                    "1- Bebida \n" +
                    "2- Alimento \n");
            tipo = ServicioMenu.sc.nextInt();
            this.validarTipoProducto();
        }
        System.out.print("Codigo del producto: ");
        dto.codigo = ServicioMenu.sc.nextInt();
        while(true) {
            if (repo.getProducto(dto.codigo).getCodigo() == dto.codigo) {
                System.out.println("El producto ya existe, ingrese otro codigo porfavor: ");
                dto.codigo = ServicioMenu.sc.nextInt();
            } else {
                break;
            }
        }
        ServicioMenu.sc.nextLine();
        System.out.print("Nombre del producto: ");
        dto.nombre = ServicioMenu.sc.nextLine();
        System.out.print("Agrege una descripcion: ");
        dto.descripcion = ServicioMenu.sc.nextLine();
        if(tipo == 1){
            System.out.print("Litros del producto: ");
            dto.litros = ServicioMenu.sc.nextDouble();
        }
        else if(tipo == 2){
            System.out.print("Peso del producto: ");
            dto.pesoKg = ServicioMenu.sc.nextDouble();
        }
        System.out.print("Precio del producto: ");
        dto.precio = ServicioMenu.sc.nextDouble();
        ServicioMenu.sc.nextLine();
        this.crearProducto();

    }

    public void validarTipoProducto(){
        try {
            switch (this.tipo) {
                case 1:
                    dto.tipoProducto = ProductoEnum.BEBIDA;
                    bandera = false;
                    break;
                case 2:
                    dto.tipoProducto = ProductoEnum.ALIMENTO;
                    bandera = false;
                    break;
                default:
                    System.out.println("Seleccioene una de las opciones");
                    Thread.sleep(3000);
                    break;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void crearProducto() {
        if(dto.tipoProducto == ProductoEnum.BEBIDA){
            producto = new Bebida(dto.codigo, dto.nombre, dto.descripcion, dto.precio, dto.litros);
        }
        else if(dto.tipoProducto == ProductoEnum.ALIMENTO){
            producto = new Alimento(dto.codigo, dto.nombre, dto.descripcion, dto.precio, dto.pesoKg);
        }

        repo.addProducto(producto);

    }

}
