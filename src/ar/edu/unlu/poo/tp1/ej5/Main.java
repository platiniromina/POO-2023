package ar.edu.unlu.poo.tp1.ej5;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static ListaTareas listaTareas = new ListaTareas();

    public static void main(String[] args) {
        int opcion;
        do {
            listaTareas.comprobarVencimiento();
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> crearTarea();
                case 2 -> modificarDescripcion();
                case 3 -> modificarPrioridad();
                case 4 -> completarTarea();
                case 5 -> mostrarTareas();
                case 6 -> mostrarTareasNoVencidas();
                case 7 -> agregarColaborador();
                case 8 -> asignarTarea();
                case 9 -> mostrarTareasColaborador();
            }
        } while (opcion != 0);
    }

    static void menu() {
        System.out.println("\t\nMENU DE LA LISTA DE TAREAS");
        System.out.println("1. Crear tarea");
        System.out.println("2. Modificar descripción de una tarea");
        System.out.println("3. Modificar prioridad de una tarea");
        System.out.println("4. Completar tarea");
        System.out.println("5. Mostrar todas las tareas");
        System.out.println("6. Mostrar tareas no vencidas");
        System.out.println("7. Agregar colaborador");
        System.out.println("8. Asignar tarea");
        System.out.println("9. Mostrar tareas de un colaborador");
        System.out.println("0. Salir");
        System.out.print("Ingresá opción: ");
    }
    static void crearTarea() {
        System.out.println("--- Creando tarea ---");
        System.out.print("Ingresá descripción de la tarea: ");
        String descripcion = sc.nextLine();
        System.out.print("Ingresá prioridad de la tarea (Alta, Media, Baja): ");
        Tarea.Prioridad prioridad = Tarea.Prioridad.valueOf(sc.nextLine().toUpperCase());
        System.out.print("Ingresá estado de la tarea (Completa, Incompleta): ");
        Tarea.Estado estado = Tarea.Estado.valueOf(sc.nextLine().toUpperCase());
        System.out.print("Ingresá fecha límite de la tarea (dd/MM/yy): ");
        String fechaLimite = sc.nextLine();
        System.out.print("Ingresá fecha de recordatorio de la tarea (dd/MM/yyyy): ");
        String fechaRecordatorio = sc.nextLine();

        listaTareas.crearTarea(descripcion.toLowerCase(), prioridad, estado, fechaLimite, fechaRecordatorio);
    }

    static void modificarDescripcion() {
        mostrarTareas();
        System.out.println("--- Modificando descripción de una tarea ---");
        System.out.print("Ingresá número de tarea a modificar: ");
        int numero = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print("Ingresá nueva descripción: ");
        String descripcion = sc.nextLine();

        listaTareas.modificarDescripcionTarea(numero, descripcion);

    }
    static void modificarPrioridad() {
        mostrarTareas();
        System.out.println("--- Modificando prioridad de una tarea ---");
        System.out.print("Ingresá número de tarea a modificar: ");
        int numero = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print("Ingresá nueva prioridad (Alta, Media, Baja): ");
        Tarea.Prioridad prioridad = Tarea.Prioridad.valueOf(sc.nextLine().toUpperCase());

        listaTareas.modificarPrioridadTarea(numero, prioridad);
    }
    static void completarTarea() {
        mostrarTareas();
        System.out.print("Ingrese número de tarea a completar: ");
        int numero = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print("Ingrese quién la completó: ");
        String persona = sc.nextLine();
        listaTareas.completarTarea(numero, persona);
    }
    static void mostrarTareas() {
        System.out.println("--- Todas las tareas ---");
        listaTareas.mostrarLista();
    }
    static void mostrarTareasNoVencidas() {
        System.out.println("--- Tareas no vencidas ---");
        listaTareas.mostrarTareasNoVencidas();

    }
    static void agregarColaborador() {
        System.out.println("--- Agregando colaborador ---");
        System.out.print("Ingrese nombre de colaborador: ");
        String nombre = sc.nextLine();
        listaTareas.crearColaboradores(nombre.toLowerCase());
    }
    static void asignarTarea() {
        System.out.println("--- Asignando una tarea ---");
        System.out.print("Ingresá descripción de la tarea: ");
        String descripcion = sc.nextLine();
        System.out.print("Ingresá a quién asignarla: ");
        String nombre = sc.nextLine();

        listaTareas.asignarTarea(descripcion, nombre);
    }
    static void mostrarTareasColaborador() {
        System.out.println("--- Mostrando tareas de un colaborador ---");
        System.out.print("Ingrese el nombre del colaborador: ");
        String colaborador = sc.nextLine();
        listaTareas.mostrarTareasColaborador(colaborador);
    }


}
