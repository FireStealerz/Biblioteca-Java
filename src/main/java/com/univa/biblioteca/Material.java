package com.univa.biblioteca;

public abstract class Material {

    protected String tipoMaterial;

    protected String codigo;

    protected String autor;

    protected String titulo;

    protected int anio;

    protected String status;

    protected static final int CAPACIDAD_MAXIMA = 10;

    private enum estado {
        MENU_PRINCIPAL, MENU_ALTA, MENU_BJA,
    }

    private String getTipoMaterial() {
        return tipoMaterial;
    }

    private void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    private String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private int getAnio() {
        return anio;
    }

    private void setAnio(int anio) {
        this.anio = anio;
    }

    private String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }


    public static void menuMaterial() {
        System.out.println("Menu de Material: \n" +
                "1.-Ver Material existentes\n" +
                "2.-Dar de alta Material\n" +
                "3.-Dar de baja Material\n" +
                "4.-Cambio de Material(cambiar detalles del Material)\n" +
                "5.-Salir del menu");
    }

    @Override
    public String toString() {
        return "Revista:\n" +
                "Tipo Revista: '" + tipoMaterial + '\'' + "\n"+
                ", Codigo: '" + codigo + '\'' + "\n" +
                ", Autor:' " + autor + '\'' + "\n" +
                ", Titulo: '" + titulo + '\'' + "\n" +
                ", Anio: " + anio + "\n" +
                ", Status: '" + status + '\'' + "\n";
    }

    public static void menuAltaBajaMaterial() {
        System.out.println("De que tipo sera: \n" +
                "1.-Libro\n" +
                "2.-Revista\n");
    }

    public static void imprimirLibrosyRevistas() {
        Libro.imprimirLibros();
        Revista.imprimirRevistas();
    }
}
