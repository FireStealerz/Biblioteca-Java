package com.univa.biblioteca;

public class Alumno extends Persona{

    private int matricula;

    public static Alumno[] alumnos = new Alumno[CAPACIDAD_MAXIMA];
    public Alumno(String nombre, String apellido, String correo, int numero, int matricula) {
        super.tipoPersona = "Alumno";
        super.nombre = nombre;
        super.apellido = apellido;
        super.correo = correo;
        super.numero = numero;
        super.numLibros = 0;
        super.adeudo = 0;
        setMatricula(matricula);
    }

    private int getMatricula() {
        return matricula;
    }

    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno: " +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Correo: '" + correo + '\'' +
                ", Numero: " + numero +
                ", Numero de libros aprestados: " + numLibros +
                ", Adeudo: " + adeudo +
                ", Matricula: " + matricula;
    }

    public static int imprimirAlumnos() {
        int counter = 0;
        for (int i = 0; i < alumnos.length ; i++) {
            if (alumnos[i] != null) {
                System.out.println(i + ": " + alumnos[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No hay alumnos dados de alta en la bilbioteca!");
            return 1;
        }
        return 0;
    }
}
