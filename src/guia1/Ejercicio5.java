/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *Pedir al usuario que ingrese el valor del radio de una circunferencia.
 *Calcular y mostrar por pantalla el área y el perímetro. Recordá que el
 *área y el perímetro se calculan con las siguientes fórmulas:
 * area = PI × radio2
 * perimetro = 2 × PI × radio
 * @author hgauna
 */
public class Ejercicio5 {
        public static void main(String[] args){
        System.out.println("Hola ejercicio 5!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = leer.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);

        leer.close();
        

    }
}
