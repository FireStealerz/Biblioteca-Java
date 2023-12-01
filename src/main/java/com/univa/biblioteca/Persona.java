package com.univa.biblioteca;

public abstract class Persona {

    protected String tipoPersona;

    protected String nombre;

    protected String apellido;

    protected String correo;

    protected int numero;

    protected int numLibros;

    protected double adeudo;

    protected static final int CAPACIDAD_MAXIMA = 10;

    private String getTipoPersona() {
        return tipoPersona;
    }

    private void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private String getCorreo() {
        return correo;
    }

    private void setCorreo(String correo) {
        this.correo = correo;
    }

    private int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private int getNumLibros() {
        return numLibros;
    }

    private void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    private double getAdeudo() {
        return adeudo;
    }

    private void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }

    public static void menuPesona() {
        System.out.println("Menu de Personas: \n" +
                "1.-Ver Personas existentes\n" +
                "2.-Dar de alta Persona\n" +
                "3.-Dar de baja Persona\n" +
                "4.-Cambio de Persona(cambiar detalles de la Persona)\n" +
                "5.-Salir del menu");
    }


    public static void menuAltaBajaPersona() {
        System.out.println("De que tipo sera: \n" +
                "1.-ALumno\n" +
                "2.-Profesor\n");
    }


    public static void imprimirAlumnosyProfesores() {
        Alumno.imprimirAlumnos();
        Profesor.imprimirProfesores();
    }
}

