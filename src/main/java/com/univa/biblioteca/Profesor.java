package com.univa.biblioteca;

public class Profesor extends Persona{

    private int numeroEmpleado;

    public static Profesor[] profesors = new Profesor[CAPACIDAD_MAXIMA];
    
    public Profesor(String nombre, String apellido, String correo, int numero, int numeroEmpleado) {
        super.tipoPersona = "Profesor";
        super.nombre = nombre;
        super.apellido = apellido;
        super.correo = correo;
        super.numero = numero;
        super.numLibros = 0;
        super.adeudo = 0;
        setNumeroEmpleado(numeroEmpleado);
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Profesor: " +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Correo: '" + correo + '\'' +
                ", Numero: " + numero +
                ", Numero de libros aprestados: " + numLibros +
                ", Adeudo: " + adeudo +
                ", Numero de Empleado: " + numeroEmpleado;
    }

    public static int imprimirProfesores() {
        int counter = 0;
        for (int i = 0; i < profesors.length ; i++) {
            if (profesors[i] != null) {
                System.out.println(i + " " + profesors[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No hay profesores dados de alta en la bilbioteca!");
            return 1;
        }
        return 0;
    }
}
