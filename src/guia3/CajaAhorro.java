/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

/**
 *
 * @author hgauna
 */
public class CajaAhorro extends CuentaBancaria {

    // k) Método retirar(double retiro) que recibe una cantidad positiva de dinero a
    // retirar, la resta del saldo actual y devuelve el
    // importe efectivamente retirado. Si el importe a retirar es negativo, el
    // método no debe hacer nada.
    public void retirar(double retiro) {
        if (retiro > 0) {
            if (retiro > super.getSaldo()) {
                System.out.println("\nEl monto a retirar es superior al saldo disponible");
                System.out.println("Retire " + super.getSaldo() + "$");
                super.setSaldo(0.00);
            } else {
                System.out.println("Retire " + retiro + "$");
                super.setSaldo(super.getSaldo() - retiro);
                System.out.println("\nNuevo Saldo: $" + super.getSaldo());
            }
        }
    }
}
