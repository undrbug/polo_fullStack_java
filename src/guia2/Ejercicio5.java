/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 * Escribir un algoritmo que lea un valor n por teclado y muestre los
 * primeros n términos de la sucesión de Fibonacci.
 * Tip: la sucesión de Fibonacci comienza con 0, luego 1 y a partir de allí
 * cada nuevo número es la suma de los dos anteriores.
 * 
 * @author hgauna
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 5 guia_2!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el numero de terminos de la sucision fibonacci");
        int n = leer.nextInt();
        int anterior = 0;
        int actual = 1;
        int fibonacci = 0;
        for (int i = 0; i < n; i++) {
            fibonacci = anterior + actual;
            System.out.println("el termino "  + (i+1) + " = " + fibonacci);
            anterior = actual;
            actual = fibonacci;
        }
        leer.close();
    }
}
