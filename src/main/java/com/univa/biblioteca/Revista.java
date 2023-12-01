package com.univa.biblioteca;

public class Revista extends Material{

    public static Revista[] revistas = new Revista[CAPACIDAD_MAXIMA];

    public Revista(String tipoMaterial, String codigo, String autor, String titulo, int anio
            , String status) {
        super.tipoMaterial =tipoMaterial;
        super.codigo = codigo;
        super.autor = autor;
        super.titulo = titulo;
        super.anio = anio;
        super.status = status;
    }

    private Revista[] getrevistas() {
        return revistas;
    }

    private void setrevistas(Revista[] revistas) {
        this.revistas = revistas;
    }
    
    protected void cambioMaterial() {

    }


    public static int imprimirRevistas() {
       int counter = 0;
        for (int i = 0; i < revistas.length ; i++) {
            if (revistas[i] != null) {
                System.out.println(i + ": " +revistas[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No hay revistas dados de alta en la bilbioteca!");
            return 1;
        }
        return 0;
    }

}
