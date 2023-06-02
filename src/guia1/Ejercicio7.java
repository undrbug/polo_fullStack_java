/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *Escribir un programa que reciba el valor de dos edades y las guarde
 *en dos variables. Luego el programa debe intercambiar los valores de
 *ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
 *ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
 *mostrar edad1 = 35 y edad2 = 24.
 * @author hgauna
 */
public class Ejercicio7 {
        public static void main(String[] args){
        System.out.println("Hola ejercicio 7!");
        System.out.println("Ingrese la primer edad");
        Scanner leer = new Scanner(System.in);
        int edad1 = leer.nextInt();
        System.out.println("Ingrese la segunda edad");
        int edad2 = leer.nextInt();
        int aux;
        aux = edad1;
        edad1 = edad2;
        edad2 = aux;
        System.out.println("La primera edad es: " + edad1);
        System.out.println("La segunda edad es: " + edad2);
    }
}
