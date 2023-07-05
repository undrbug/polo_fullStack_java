/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

/**
 *
 * @author hgauna
 */
public class main {
    public static void main(String[] args) {
        // Libro libro = new Libro();
        // libro.cargarLibro();

        // Circunferencia circunferencia = new Circunferencia(4.0);
        // circunferencia.area();
        // circunferencia.perimetro();

        System.out.println("\nClase CuentaBancaria");
        CuentaBancaria cb = new CuentaBancaria(45622133, 29010069, 1000.00);
        cb.setSaldo(1000.00);
        cb.setNumero(456466552);
        cb.setDni(29010069);
        cb.consultarSaldo();
        cb.extraccionRapida();
        cb.consultarDatos();

        System.out.println("\nClase CuentaCorriente");
        CuentaCorriente cc = new CuentaCorriente();
        cc.setSaldo(1000.00);
        cc.setNumero(456466552);
        cc.setDni(29010069);
        cc.consultarSaldo();
        cc.extraccionRapida();
        cc.retirar(1000.00);
        cc.consultarDatos();

        System.out.println("\nClase CajaAhorro");
        CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(1000.00);
        ca.setNumero(456466552);
        ca.setDni(29010069);
        ca.consultarSaldo();
        ca.extraccionRapida();
        ca.retirar(1000.00);
        ca.consultarDatos();

    }
}
