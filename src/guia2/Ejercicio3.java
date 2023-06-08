/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Escribir un programa que ordene un arreglo de números enteros de
 * manera ascendente.
 * 
 * @author hgauna
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 3 guia_2!");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo de numeros enteros");
        int n = leer.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el elemento #" + (i + 1));
            arr[i] = leer.nextInt();
        }
        int i = 0;
        for (int element : arr) {
            i += 1;
            System.out.println("elemento #" + (i) + "= " + element);
        }
        System.out.println("Ordnamos el arreglo");
        Arrays.sort(arr);
        for (int element : arr) {
            i += 1;
            System.out.println("elemento #" + (i) + "= " + element);
        }
        leer.close();
    }
}
