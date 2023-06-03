/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 * Escribir un programa que reciba un número entero por teclado. A
 * continuación, mostrar la tabla de multiplicar de ese número.
 * 
 * @author hgauna
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 1 guia_2!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        System.out.println("Tabla de multiplicar");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        leer.close();
    }
}
