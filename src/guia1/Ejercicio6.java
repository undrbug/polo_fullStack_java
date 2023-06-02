/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *Pedir al usuario que ingrese el precio de un producto y el porcentaje
 *de descuento. A continuación mostrar por pantalla el importe
 *descontado y el importe a pagar.
 * @author hgauna
 */
public class Ejercicio6 {
        public static void main(String[] args){
        System.out.println("Hola ejercicio 6!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = leer.nextDouble();
        double importe = precio - (precio * descuento / 100);
        System.out.println("El importe a pagar sin descuento es: " + precio);
        System.out.println("El importe a pagar scon descuento es: " + importe);

        leer.close();
    }
}
