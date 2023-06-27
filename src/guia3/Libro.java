/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author hgauna
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private Integer cantPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, Integer cantPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantPaginas(Integer cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getCantPaginas() {
        return cantPaginas;
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro:");
        this.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del autor:");
        this.setAutor(leer.nextLine());
        System.out.println("Ingrese el ISBN del libro:");
        this.setIsbn(leer.nextLine());
        System.out.println("Ingrese la cantidad de paginas del libro:");
        this.setCantPaginas(leer.nextInt());
        informar();
    }
    
    public void informar() {
        System.out.println("Libro cargado exitosamente. " + "su ISBN es: " + this.getIsbn());
    }
    
}
