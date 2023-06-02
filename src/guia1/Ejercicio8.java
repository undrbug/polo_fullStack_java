/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
Pedir al usuario que ingrese una temperatura en grados Celsius y
mostrar por pantalla su equivalente en kelvin y grados Fahrenheit. Las
fórmulas para conversiones son:
Kelvin = 273,15 + Celsius
Fahrenheit = 1,8 × Celsius
 * @author hgauna
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Hola ejercicio 8!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celsius: ");
        Double celsius = leer.nextDouble();
        Double kelvin = 273.15 + celsius;
        Double fahrenheit = 1.8 * celsius; //creo que la forumula es distinta. (20 °C × 9/5) + 32 = 68 °F
        System.out.println("La temperatura en Kelvin es: " + kelvin);
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        leer.close();
    }
}
