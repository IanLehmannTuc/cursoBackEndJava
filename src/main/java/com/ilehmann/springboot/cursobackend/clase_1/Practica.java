package com.ilehmann.springboot.cursobackend.clase_1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Practica {

    public static void main(String[] args){

        //Ejecicio de variables y operaciones
        double precioProducto = 10.5;
        int cantidadProducto = 3;

        System.out.println("El precio actual del producto es: " + precioProducto);
        System.out.println("La cantidad actual del producto es: " + cantidadProducto);

        double precioTotal = precioProducto * cantidadProducto;
        System.out.println("El total a pagar es de: " + precioTotal);

        precioProducto = 12.75;
        precioTotal = precioProducto * cantidadProducto;
        System.out.println("Ahora, por la inflacion, el precio del producto es de: " + precioProducto);
        System.out.println("Por lo tanto, ahora el total a pagar es de: " + precioTotal + ".");

        //Ejercicio de Ingresar valor por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su Nombre completo por favor: ");
        String nombreCliente = sc.nextLine();
        System.out.print("Ingrese la cantidad de productos que desea Comprar por favor: ");
        cantidadProducto = Integer.parseInt(sc.nextLine());
        precioTotal = precioProducto * cantidadProducto;
        System.out.println("Su nombre es " + nombreCliente + " y desea comprar " + cantidadProducto + " productos.");
        System.out.println("Sabiendo que el producto vale: " + precioProducto);
        System.out.println("Por lo tanto abonara: " + precioTotal);

        //Ejercicio de Condicionales
        double descuento = 0.05;
        if(cantidadProducto >= 100){
            System.out.println("Como usted pidio una cantidad exorbitante del producto.");
            System.out.println("Le ofrecemos un descuentazo del " + (descuento * 100) + "% :D");
            precioTotal = precioTotal - (precioTotal * descuento);
            System.out.println("El total a pagar es de: " + precioTotal);
        }

        //Ejercicio de bucles
        System.out.print("Ingrese un numero para reiterar con el ciclo 'for' hasta ahi: ");
        int numero = sc.nextInt();
        for(int i = 1; i <= numero; i++){
            System.out.println("Numero: " + i);
        }
        System.out.println("Ahora reiterara con el ciclo 'while'");
        int i = 1;
        while(i <= numero){
            System.out.println("Numero: " + i);
            i++;
        }
    }
}
