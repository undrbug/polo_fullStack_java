/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

/**
 *
 * @author hgauna
 */
public class Circunferencia {
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void area() {     
        System.out.println("El área es: " + (Math.PI * (this.radio * this.radio)));
    }
    
    public void perimetro() {
        System.out.println("El perímetro es: " + (2*Math.PI*this.radio));
    }
}
