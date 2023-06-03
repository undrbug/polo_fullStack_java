/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 * Escribir un programa que lea una palabra por teclado y determine si
 * es un palíndromo.
 * Tip: los palíndromos son palabras que se leen igual de izquierda a
 * derecha y viceversa. Por ejemplo, reconocer.
 * 
 * @author hgauna
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 2 guia_2!");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(palabraInvertida)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
        leer.close();
    }
}
