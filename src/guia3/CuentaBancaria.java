/*
 * La clase debe contar con los siguientes métodos:
 *   d) Constructor por defecto
 *   e) Constructor con DNI, saldo y número de cuenta.
 *   f) Métodos getters y setters correspondientes.
*    g) Método ingresar(double ingreso) que recibe una cantidad positiva de dinero a ingresar y la suma al saldo actual. Si el importe a ingresar es negativo, el método no debe hacer nada.
*    h) Método extraccionRapida() que retira el 20% del saldo y devuelve el importe retirado.
*    i) Método consultarSaldo() que permitirá consultar el saldo.
*    j) Método consultarDatos() que mostrará todos los datos de la cuenta
 */
package guia3;

/**
 *
 * @author hgauna
 */
public class CuentaBancaria {
    private Integer numero;
    private long dni;
    private Double saldo;

    // d) Constructor por defecto
    public CuentaBancaria() {
    }
    // e) Constructor con DNI, saldo y número de cuenta.
    public CuentaBancaria(Integer numero, long dni, Double saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }
    //f) Métodos getters y setters correspondientes.
    public Integer getNumero() {
        return numero;
    }

    public long getDni() {
        return dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    //g) Método ingresar(double ingreso) que recibe una cantidad positiva de dinero a ingresar y la suma al saldo actual. 
    //   Si el importe a ingresar es negativo, el método no debe hacer nada.
    public void ingresar(Double ingreso) {
        if (ingreso >0) {
            this.setSaldo(this.saldo + ingreso);
        } else{
            System.out.println("No se puede ingresar un valor negativo");
        }
    }

    //h) Método extraccionRapida() que retira el 20% del saldo y devuelve el importe retirado.
    public Double extraccionRapida() {
        Double extraccion = this.saldo * 0.20;
        System.out.println("El monto a extraer es de: " + extraccion);
        this.setSaldo(this.saldo - extraccion);
        System.out.println("El saldo de la cuenta es de: " + this.getSaldo());
        return extraccion;
    }
    
    //i) Método consultarSaldo() que permitirá consultar el saldo.
    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + this.saldo);
    }
    //j) Método consultarDatos() que mostrará todos los datos de la cuenta
    public void consultarDatos() {
        System.out.println("\nLos datos de la cuenta son:");
        System.out.print("Número de Cuenta: ");
        System.out.println(this.getNumero());
        System.out.print("DNI: ");
        System.out.println(this.getDni());
        System.out.print("Saldo Actual: $"+String.format("%,.2f", this.getSaldo()));
        System.out.println();
    }
}
