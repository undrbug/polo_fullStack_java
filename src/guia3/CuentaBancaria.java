/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

/**
 *
 * @author hgauna
 */
public class CuentaBancaria {
    private Integer numero;
    private Long dni;
    private Double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Integer numero, Long dni, Double saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Long getDni() {
        return dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar() {
        
    }
    
    public void extraccionRapida() {
        
    }
    
    public void consultarSaldo() {
        
    }
    
    public void consultarDatos() {
        
    }
}
