/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *Escribir un programa que lea la estatura de tres personas, calcule el
 *promedio de la altura de ellos y lo informe.
 * @author hgauna
 */
public class Ejercicio4 {
        public static void main(String[] args){
        System.out.println("Hola ejercicio 4!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la estatura de la primer persona:");
        double altura1 = leer.nextDouble();
        System.out.println("Ingrese la estatura de la segunda persona:");
        double altura2 = leer.nextDouble();
        System.out.println("Ingrese la estatura de la tercer persona:");
        double altura3 = leer.nextDouble();
        System.out.println("El promedio de las alturas ingresadas es: " + ((altura1 + altura2 + altura3) / 3));
        leer.close();
    }
}
