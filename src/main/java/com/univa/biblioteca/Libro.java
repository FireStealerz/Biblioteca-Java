package com.univa.biblioteca;

public class Libro  extends  Material{

    private String editorial;

    public static Libro[] libros = new Libro[CAPACIDAD_MAXIMA];

    public Libro(String tipoMaterial, String codigo, String autor, String titulo, int anio
                 , String status, String editorial) {
        super.tipoMaterial =tipoMaterial;
        super.codigo = codigo;
        super.autor = autor;
        super.titulo = titulo;
        super.anio = anio;
        super.status = status;
        this.editorial = editorial;
    }

    private Libro[] getLibros() {
        return libros;
    }

    private void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    private String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro:\n" +
                "Tipo Libro: '" + tipoMaterial + '\'' + "\n"+
                ", Codigo: '" + codigo + '\'' + "\n" +
                ", Autor:' " + autor + '\'' + "\n" +
                ", Titulo: '" + titulo + '\'' + "\n" +
                ", Anio: " + anio + "\n" +
                ", Status: '" + status + '\'' + "\n" +
                ", Editorial: '" + editorial + '\'' + "\n";
    }


    public static int imprimirLibros() {
        int counter = 0;
        for (int i = 0; i < libros.length ; i++) {
            if (libros[i] != null) {
                System.out.println(i +": " +  libros[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No hay libros dados de alta en la bilbioteca!");
            return 1;
        }
        return 0;
    }
}
