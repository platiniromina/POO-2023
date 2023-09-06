package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListaTareas { // esta clase es el administrador de las tareas
    private ArrayList<Tarea> listaTareas = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public ListaTareas() {
        crearTarea("ir al supermercado", Tarea.Prioridad.BAJA, Tarea.Estado.INCOMPLETA, "08/09/23", "07/09/23");
        crearTarea("consultar repuesto del auto", Tarea.Prioridad.ALTA, Tarea.Estado.COMPLETA, "05/09/23", "04/09/23");
        crearTarea("ir al cine a ver la nueva pelicula de marvel", Tarea.Prioridad.BAJA, Tarea.Estado.INCOMPLETA, "05/09/23", "04/09/23");
    }
    public void crearColaboradores(String nombre) {
        Colaborador colaborador = new Colaborador(nombre);
        colaboradores.add(colaborador);
    }
    public void crearTarea(String descripcion, Tarea.Prioridad prioridad, Tarea.Estado estado, String fechaLimite, String fechaRecordatorio) {
        Tarea task = new Tarea(descripcion, prioridad, estado, fechaLimite, fechaRecordatorio);
        listaTareas.add(task);
    }
    public void completarTarea(int tarea, String user) {
        Tarea task = listaTareas.get(tarea);
        Colaborador colaborador = buscarColaborador(user);
        task.setEstado(Tarea.Estado.COMPLETA);
        task.setFechaCompletada(LocalDate.now()); // me falta agregar el colaborador
        task.setUser(colaborador);
    }
    public void modificarPrioridadTarea(int tarea, Tarea.Prioridad prioridad) {
        Tarea task = listaTareas.get(tarea);
        task.setPrioridad(prioridad);
    }
    public void modificarDescripcionTarea(int tarea, String descripcion) {
        Tarea task = listaTareas.get(tarea);
        task.setDescripcion(descripcion);
    }
    public void asignarTarea(String tarea, String colaborador) {
        Tarea task = buscarTarea(tarea);
        Colaborador user = buscarColaborador(colaborador);
        if (!colaborador.equals(null) && !tarea.equals(null)) {
            task.setUser(user);
        }
        else {
            System.out.println("No existe ese colaborador o esa tarea");
        }
    }

    public void mostrarLista() {
        int i=1;
        for(Tarea tarea : listaTareas) {
            System.out.printf("%d. %s\n", i, tarea.mostrarTarea());
        }
    }
    public void mostrarTareasColaborador(String nombre) {
        Colaborador colaborador = buscarColaborador(nombre);
        int i=1;
        for(Tarea tarea : listaTareas) {
            if (tarea.getUser().equals(colaborador) && !colaborador.equals(null)) {
                System.out.printf("%d. %s \n", i, tarea.mostrarTarea());
            }
        }
        System.out.println("No hay tareas para ese colaborador o no existe colaborador");
    }
    public void mostrarTareasNoVencidas() {
        Comparator<Tarea> byPrioridad = Comparator.comparing(Tarea::getPrioridad);
        Comparator<Tarea> byFechaLimite = Comparator.comparing(Tarea::getFechaLimite);

        listaTareas.sort(byPrioridad.thenComparing(byFechaLimite));
        int i=1;
        for(Tarea tarea : listaTareas) {
            if (!tarea.estaVencida()) {
                System.out.println(tarea.mostrarTarea());
            }
        }
    }
    public void mostrarTareasNoCompletadas() {
        for(Tarea tarea : listaTareas) {
            if (!tarea.estaCompleta()) {
                System.out.println(tarea.mostrarTarea());
            }
        }
    }
    private Tarea buscarTarea(String titulo) {
        for (Tarea tarea : listaTareas) {
            if (tarea.buscar(titulo)) {
                return tarea;
            }
        }
        return null;
    }
    private Colaborador buscarColaborador(String nombre) {
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getNombre().equals(nombre.toLowerCase())) {
                return colaborador;
            }
        }
        return null;
    }
    public void ordenarTareas() {

    }

    public void comprobarVencimiento() {
        for (Tarea tarea : listaTareas) {
            if (tarea.estaPorVencer()) {
                tarea.setPrioridad(Tarea.Prioridad.ALTA);
            }
        }
    }
}
