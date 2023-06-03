/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

/**
 * Escribir un algoritmo que imprima el listado de los números primos
 * menores que 200. Aclaración: el número 1 no es primo.
 * Tip: un número es primo si es divisible únicamente por 1 y por sí
 * mismo.
 * Por ejemplo, el 7 es primo porque sólo es divisible por 1 y por 7.
 * El 6 no es primo porque es divisible por 1, por 2, por 3 y por 6.
 * 
 * @author hgauna
 */

// mostrar numeros primos desde el 1 hasta el 200?

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 6 guia_2!");
        System.out.println("Listado de números primos menores que 200:");
        for (int i = 2; i < 200; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
        
    }
       public static boolean esPrimo(int numero) {

        for (int i = 2; i <= 200; i++) {
            if (numero % i == 0 && numero % numero == 0) {
                if (i!=1 && i!=numero){
                    if (numero % i == 0) {
                        return false;
                    }
                }else{
                    return true;
                }
            }
        }
        return false;
    }

}


//Otra forma
// public static void main(String[] args) {
//     System.out.println("Hola, ejercicio 6 guia_2!");
//     System.out.println("Listado de números primos menores que 200:");
//     for (int numero = 2; numero < 200; numero++) {
//         if (esPrimo(numero)) {
//             System.out.println(numero);
//         }
//     }
    
// }
//    public static boolean esPrimo(int numero) {
//     if (numero <= 1) {
//         return false;
//     }
//     for (int i = 2; i <= Math.sqrt(numero); i++) {
//         if (numero % i == 0) {
//             return false;
//         }
//     }
//     return true;
// }