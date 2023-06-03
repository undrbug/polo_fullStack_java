/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 * Del listado de abajo, determinar qué animal eligió el usuario mediante
 * la realización de tres preguntas del tipo SI/NO acerca de las tres
 * características elegidas (herbívoro, mamífero, doméstico). Mostrar el
 * resultado por pantalla.
 * 
 * @author hgauna
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Hola, ejercicio 7 guia_2!");
        Scanner leer = new Scanner(System.in);
        String herviboro, mamifero, domestico;
        //cargarMatriz(vector)
        //Cargo la matriz/vector
        String[][] vector = {
            {"Alce", "SI", "SI", "NO"},
            {"Caballo", "SI", "SI", "SI"},
            {"Caracol", "SI", "NO", "NO"},
            {"Cóndor", "NO", "NO", "NO"},
            {"Gato", "NO", "SI", "SI"},
            {"León", "NO", "SI", "NO"},
            {"Pitón", "NO", "NO", "SI"},
            {"Tortuga", "SI", "NO", "SI"}
        };
        //Pido el ingreso por teclado.
        System.out.println("¿Es un animal herbívoro? (SI/NO)");
        herviboro = leer.nextLine();
        System.out.println("¿Es un animal mamífero? (SI/NO)");
        mamifero = leer.nextLine();
        System.out.println("¿Es un animal doméstico? (SI/NO)");
        domestico = leer.nextLine();

        //Recorro el vector/Matriz
        for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (vector[i][1].equals(herviboro.toUpperCase())) {
                    if (vector[i][2].equals(mamifero.toUpperCase())) {
                        if (vector[i][3].equals(domestico.toUpperCase())) {
                            System.out.println("Entonces es un: " + vector[i][0]);
                            break;
                        }
                    }
                }
            }
        }
        leer.close();
    }

}

//comence a hacer la carga mediante el uso de for's pero iba a ser demasiado largo el cogigo.
//Decidi cargarlo de otra forma. 
// public static void cargarMatriz(String[][] vector) {
//     for (int i = 0; i < 4; i++) {
//         for (int j = 0; j < 8; j++) {
//             if (i==0) {
//                 switch (j) {
//                     case 0:
//                         vector[0][j] = "Alce";
//                         break;
//                     case 1:
//                         vector[0][j] = "Caballo";
//                         break;
//                     case 2:
//                         vector[0][j] = "Caracol";
//                         break;
//                     case 3:
//                         vector[0][j] = "Condor";
//                         break;
//                     case 4:
//                         vector[0][j] = "Gato";
//                         break;
//                     case 5:
//                         vector[0][j] = "Leon";
//                         break;
//                     case 6:
//                         vector[0][j] = "Piton";
//                         break;
//                     case 7:
//                         vector[0][j] = "Tortuga";
//                         break;
//                 }
//             } else {
                
//             }
//         }
//     }
// }
