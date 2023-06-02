/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *Escribir un programa que lea dos números y realice el cálculo de la
 *suma, la resta, la multiplicación y la división entre ambos valores. Los
 *resultados deben mostrarse por pantalla.
 * @author hgauna
 */
public class Ejercicio3{
        public static void main(String[] args) {
        System.out.println("Hola ejercicio 3!");
        System.out.println("""
                           Ingrese dos numeros:
                           """);
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        Double num1 =  leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        Double num2 =  leer.nextDouble();

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicacion es: " + (num1 * num2));
            
        if (num2 == 0) {
            System.out.println("Error: division entre cero");
        } else {
            System.out.println("La division es: " + (num1 / num2));    
        }
        leer.close();
    }
}
