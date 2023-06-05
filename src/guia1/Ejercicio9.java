/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
A partir de una cantidad de pesos que el usuario ingresa a través del
teclado se debe obtener su equivalente en dólares, en euros, en
guaraníes y en reales. Para este ejercicio se consideran las siguientes
tasas:
1 dólar = 231,68 pesos
1 euro = 250,69 pesos
1 peso = 31,00 guaraníes
1 real = 46,81 pesos
Tip: en este ejercicio se puede usar la función printf y mostrar el
resultado con dos decimales.
 * @author hgauna
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Hola ejercicio 9!");
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese la cantidad de pesos: ");
            Double pesos = leer.nextDouble();
            Double dolares = pesos / 231.68;
            Double euros = pesos / 250.69;
            Double guaranies = pesos / 31.00;
            Double real = pesos / 46.81;

            /* -------------------------------
            La conversión a guaraníes está mal
            ------------------------------- */
            System.out.println(String.format("%.2f", pesos) + " pesos equivalen a :     ");
            System.out.println("                             " + String.format("%.2f", dolares )+ " dolares");
            System.out.println("                             " + String.format("%.2f", euros)+ " euros");
            System.out.println("                             " + String.format("%.2f", guaranies)+ " guaranies");
            System.out.println("                             " + String.format("%.2f", real)+ " reales");
        } catch (Exception e) {
            System.out.println("Algun error en el ingreso de datos " + e);
        }
        
        leer.close();
        
    }
}
