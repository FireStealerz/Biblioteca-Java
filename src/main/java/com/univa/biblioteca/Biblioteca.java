package com.univa.biblioteca;

import java.util.Scanner;

public class Biblioteca {
    public static final Scanner scanner = new Scanner(System.in);
    static int contadorLibros = 0;
    static int contadorRevistas = 0;
    static int contadorAlumnos = 0;
    static int contadorProfesores = 0;

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void darAltaMaterial() {
        Material.menuAltaBajaMaterial();
        int menuAltaBaja = scanner.nextInt();
        switch (menuAltaBaja) {
            case 1 -> {
                if (contadorLibros < 10) {
                    System.out.println("Ingresa codigo");
                    String codigo = String.valueOf(contadorLibros);
                    System.out.println("Ingresa autor");
                    String autor = scanner.nextLine();
                    System.out.println("Ingresa titulo");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingresa anio");
                    int anio = scanner.nextInt();
                    System.out.println("Ingresa status");
                    String status = scanner.nextLine();
                    System.out.println("Ingresa Editorial");
                    String editorial = scanner.nextLine();
                    Libro.libros[contadorLibros++] = new Libro("Libro", codigo, autor, titulo, anio, status
                            , editorial);
                } else System.out.println("Cantidad maxima de libros!");
            }
            case 2 -> {
                if (contadorRevistas < 10) {
                    System.out.println("Ingresa codigo");
                    String codigo = String.valueOf(contadorRevistas);
                    System.out.println("Ingresa autor");
                    String autor = scanner.nextLine();
                    System.out.println("Ingresa titulo");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingresa anio");
                    int anio = scanner.nextInt();
                    System.out.println("Ingresa status");
                    String status = scanner.nextLine();
                    Revista.revistas[contadorRevistas++] = new Revista("Revista", codigo, autor, titulo, anio,
                            status);
                } else System.out.println("Cantidad maxima de revistas!");
            }
        }
    }

    public static void darBajaMaterial() {
        Material.menuAltaBajaMaterial();
        int menuAltaBaja = scanner.nextInt();
        switch (menuAltaBaja) {
            case 1 -> {
                if (Libro.imprimirLibros() == 0) {
                    System.out.println("Ingresa indice de libro a borrar:");
                    int indice = scanner.nextInt();
                    Libro.libros[indice] = null;
                }
            }
            case 2 -> {
                if (Revista.imprimirRevistas() == 0) {
                    System.out.println("Ingresa indice de revista a borrar:");
                    int indice = scanner.nextInt();
                    Revista.revistas[indice] = null;
                }
            }
        }
    }

    public static void cambioMaterial() {
        Material.menuAltaBajaMaterial();
        int menuAltaBaja = scanner.nextInt();
        switch (menuAltaBaja) {
            case 1 -> {
                if (Libro.imprimirLibros() == 0) {
                    System.out.println("Ingresa indice de libro a corregir (0 al 9):");
                    int indice = scanner.nextInt();
                    System.out.println("Ingresa codigo");
                    String codigo = scanner.nextLine();
                    System.out.println("Ingresa autor");
                    String autor = scanner.nextLine();
                    System.out.println("Ingresa titulo");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingresa anio");
                    int anio = scanner.nextInt();
                    System.out.println("Ingresa status");
                    scanner.next();
                    String status = scanner.nextLine();
                    System.out.println("Ingresa Editorial");
                    String editorial = scanner.nextLine();
                    Libro.libros[indice] = new Libro("Libro", codigo, autor, titulo, anio, status
                            , editorial);
                }
            }
            case 2 -> {
                if (Revista.imprimirRevistas() == 0) {
                    System.out.println("Ingresa indice de revista a corregir (0 al 9): ");
                    int indice = scanner.nextInt();
                    System.out.println("Ingresa codigo");
                    String codigo = scanner.nextLine();
                    System.out.println("Ingresa autor");
                    String autor = scanner.nextLine();
                    System.out.println("Ingresa titulo");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingresa anio");
                    int anio = scanner.nextInt();
                    System.out.println("Ingresa status");
                    scanner.next();
                    String status = scanner.nextLine();
                    Revista.revistas[indice] = new Revista("Revista", codigo, autor, titulo, anio,
                            status);
                }
            }
        }
    }

    public static void verMateriales() {
        while (true) {
            Material.menuMaterial();
            int menuMaterial = scanner.nextInt();
            switch (menuMaterial) {
                case 1 -> {
                    Material.imprimirLibrosyRevistas();
                }
                case 2 -> {
                    darAltaMaterial();
                }
                case 3 -> {
                    darBajaMaterial();
                }
                case 4 -> {
                    cambioMaterial();
                }
                case 5 -> {
                    return;
                }
            }
        }
    }

    static void menuPrincipal() {
        while (true) {
            System.out.println("Bienvenido a la Biblioteca IRMA-IVAN!\n" +
                    "Seleccion una opcion del menu\n" +
                    "1.-Ver Materiales\n" +
                    "2.-Ver Persona\n" +
                    "3.-Salir del programa\n" +
                    "Seleccion: ");
            int seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1 -> {
                    verMateriales();
                }
                case 2 -> {
                    verPersonas();
                }
                case 3 -> {
                    System.out.println("Gracias por el 10! (; ");
                    return;
                }
            }
        }
    }

    public static void verPersonas() {
        while (true) {
            Persona.menuPesona();
            int menuPersona = scanner.nextInt();
            switch (menuPersona) {
                case 1 -> {
                    Persona.imprimirAlumnosyProfesores();
                }
                case 2 -> {
                    darAltaPersona();
                }
                case 3 -> {
                   darBajaPersona();
                }
                case 4 -> {
                   darCambioPersona();
                }
                case 5 -> {
                    return;
                }
            }
        }
    }

    public static void darAltaPersona() {
        Persona.menuAltaBajaPersona();
        int menuAltaBaja = scanner.nextInt();
        switch (menuAltaBaja) {
            case 1 -> {
                if (contadorAlumnos < 10) {
                    System.out.println("Ingresa nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa apellid");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingresa correo");
                    String correo = scanner.nextLine();
                    System.out.println("Ingresa telefono");
                    int telefono = scanner.nextInt();
                    System.out.println("Ingresa Matricula");
                    int matricula = scanner.nextInt();
                    Alumno.alumnos[contadorAlumnos++] = new Alumno(nombre, apellido, correo, telefono, matricula);
                } else System.out.println("Cantidad maxima de Alumnos!");
            }
            case 2 -> {
                if (contadorProfesores < 10) {
                    System.out.println("Ingresa nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa apellid");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingresa correo");
                    String correo = scanner.nextLine();
                    System.out.println("Ingresa telefono");
                    int telefono = scanner.nextInt();
                    System.out.println("Ingresa Numero de empleado");
                    int numeroEmpleado = scanner.nextInt();
                    Profesor.profesors[contadorProfesores++] = new Profesor(nombre, apellido, correo, telefono, numeroEmpleado);
                } else System.out.println("Cantidad maxima de Profesores!");
            }
        }
    }

    public static void darBajaPersona() {
        Persona.menuAltaBajaPersona();
        int menuAltaBaja = scanner.nextInt();
        switch (menuAltaBaja) {
            case 1 -> {
                if (Alumno.imprimirAlumnos() == 0) {
                    System.out.println("Ingresa indice de alumno a borrar:");
                    int indice = scanner.nextInt();
                    Alumno.alumnos[indice] = null;
                }
            }
            case 2 -> {
                if (Profesor.imprimirProfesores() == 0) {
                    System.out.println("Ingresa indice de profesor a borrar:");
                    int indice = scanner.nextInt();
                    Profesor.profesors[indice] = null;
                }
            }
        }
    }

    public static void darCambioPersona() {
        Persona.menuAltaBajaPersona();
        int menuAltaBaja = scanner.nextInt();
        switch (menuAltaBaja) {
            case 1 -> {
                if (Alumno.imprimirAlumnos() == 0) {
                    System.out.println("Ingresa indice de Alumno a corregir");
                    int indice = scanner.nextInt();
                    System.out.println("Ingresa nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa apellid");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingresa correo");
                    String correo = scanner.nextLine();
                    System.out.println("Ingresa telefono");
                    int telefono = scanner.nextInt();
                    System.out.println("Ingresa Matricula");
                    int matricula = scanner.nextInt();
                    Alumno.alumnos[indice] = new Alumno(nombre, apellido, correo, telefono, matricula);
                }
            }
            case 2 -> {
                if (Profesor.imprimirProfesores() == 0) {
                    System.out.println("Ingresa indice de Profesor a corregir");
                    int indice = scanner.nextInt();
                    System.out.println("Ingresa nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa apellido");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingresa correo");
                    String correo = scanner.nextLine();
                    System.out.println("Ingresa telefono");
                    int telefono = scanner.nextInt();
                    System.out.println("Ingresa Numero de empleado");
                    int numeroEmpleado = scanner.nextInt();
                    Profesor.profesors[indice] = new Profesor(nombre, apellido, correo, telefono, numeroEmpleado);
                }
            }
        }
    }
}
