package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListaTareas { // esta clase es el administrador de las tareas
    private ArrayList<Tarea> listaTareas = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public void crearListaTareas() {
        ListaTareas listaTareas = new ListaTareas();
    }
    public void crearTarea(String descripcion, Tarea.Prioridad prioridad, Tarea.Estado estado, LocalDate fechaLimite) {
        Tarea task = new Tarea(descripcion, prioridad, estado, fechaLimite);
        listaTareas.add(task);
    }
    public void completarTarea(Tarea tarea) {
        tarea.setEstado(Tarea.Estado.COMPLETA);
        tarea.setFechaCompletada(LocalDate.now()); // me falta agregar el colaborador
    }

    public void mostrarLista() {
        for(Tarea tarea : listaTareas) {
            tarea.mostrarTarea();
        }
    }
    public void mostrarTareasNoVencidas() {
        Comparator<Tarea> byPrioridad = Comparator.comparing(Tarea::getPrioridad);
        Comparator<Tarea> byFechaLimite = Comparator.comparing(Tarea::getFechaLimite);

        Collections.sort(listaTareas, byPrioridad.thenComparing(byFechaLimite));
    }
    public Tarea buscarTarea(String titulo) {
        for (Tarea tarea : listaTareas) {
            if (tarea.buscar(titulo)) {
                return tarea;
            }
        }
        return null;
    }
    public void ordenarTareas() {

    }

    private void comprobarVencimiento() {
        for (Tarea tarea : listaTareas) {
            if (tarea.estaPorVencer()) {
                tarea.setPrioridad(Tarea.Prioridad.ALTA);
            }
        }
    }
}
