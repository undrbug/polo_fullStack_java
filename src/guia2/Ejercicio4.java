/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 * Escribir un algoritmo que calcule el factorial de un número ingresado
 * por teclado.
 * Tip: el factorial de un número n es el resultado de multiplicar todos
 * los números enteros desde 1 hasta n.
 * Por ejemplo, el factorial de 5 es 1 × 2 × 3 × 4 × 5 = 120.
 * 
 * @author hgauna
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 4 guia_2!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial");
        int num = leer.nextInt();
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + num + " es " + resultado);
        leer.close();
    }
}
