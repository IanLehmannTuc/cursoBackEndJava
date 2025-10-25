package com.ilehmann.springboot.cursobackend.servicios;

import com.ilehmann.springboot.cursobackend.dominio.Bebida;
import com.ilehmann.springboot.cursobackend.dominio.Producto;
import com.ilehmann.springboot.cursobackend.dominio.repositorio.RepositorioProducto;

import java.util.Scanner;

public class ServicioMenu {

    private Boolean bandera = true;
    private ServicioAgregarProducto agregarProducto = ServicioAgregarProducto.servicioAgregarProducto();
    private ServicioModificarProducto modificarProducto = ServicioModificarProducto.servicioModificarProducto();
    private RepositorioProducto repo = RepositorioProducto.repositorioProducto();
    public static Scanner sc = new Scanner(System.in);
    public int opcion;
    public String continuar;

    public void mostrarMenu() {
        try {
            while (bandera) {
                System.out.println("1) Agregar producto\n" +
                        "2) Listar productos\n" +
                        "3) Buscar/Actualizar producto\n" +
                        "4) Eliminar producto\n" +
                        "5) Crear un pedido\n" +
                        "6) Listar pedidos\n" +
                        "7) Salir\n" +
                        "\n" +
                        "Elija una opción: ");

                opcion = sc.nextInt();

                System.out.println("Elijio la opcion : " + opcion);

                switch (opcion) {
                    case 1:
                        while(true) {
                            agregarProducto.agregarProducto();
                            System.out.println("Desea agregar otro producto? Y/N");
                            continuar = sc.nextLine();
                            while(true) {
                                if (!continuar.toUpperCase().equals("N") && !continuar.toUpperCase().equals("Y")) {
                                    System.out.println("Por favor, elija una opcion Y/N: ");
                                    continuar = sc.nextLine();
                                } else {
                                    break;
                                }
                            }
                            if(continuar.toUpperCase().equals("N")) {
                                System.out.println("Muchas garcias, será devuelto al meno en unos segundos.");
                                break;
                            }
                        }
                        break;
                    case 2:
                        for(Producto p : repo.getAll()){
                            System.out.println("Codigo: " + p.getCodigo());
                            System.out.println("Nombre: " + p.getNombre());
                            System.out.println("Descripcion: " + p.getDescripcion());
                            if(p instanceof Bebida){
                                System.out.println("Litros: " + p.getDetalle() + "Lt.");
                            }
                            else if(p instanceof Bebida){
                                System.out.println("Peso: " + p.getDetalle() + "Kg");
                            }
                            System.out.println("Cantidad: " + p.getStock());
                            System.out.println("Precio: " + p.getPrecioSinIva());
                        }
                        System.out.print("Seleccione 0 para volver al menu: ");
                        opcion = sc.nextInt();
                        while(opcion != 0) {
                            System.out.print("Por favor, si desea volver al menu selecione el 0: ");
                            opcion = sc.nextInt();
                        }
                        sc.next();
                        System.out.println("Muchas garcias, será devuelto al meno en unos segundos.");
                        break;
                    case 3:
                        mostrarMenu();
                        break;
                    case 4:
                        mostrarMenu();
                        break;
                    case 5:
                        mostrarMenu();
                        break;
                    case 6:
                        mostrarMenu();
                        break;
                    case 7:
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opcion no valida, porfavor elija de nuevo");
                        break;

                }
                Thread.sleep(3000);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
