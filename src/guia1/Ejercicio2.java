/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *Escribir un programa en el cual se le pregunte al usuario su nombre. A
 *continuación, mostrar un mensaje que diga “Hola, ” completando el
 *mensaje con el nombre que ingresó el usuario.
 * @author hgauna
 */
public class Ejercicio2 {
        public static void main(String[] args){
        System.out.println("Hola ejercicio 2!");
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        String name = leer.nextLine();
            System.out.println("Hola, " + name);
        leer.close();
    }
}
