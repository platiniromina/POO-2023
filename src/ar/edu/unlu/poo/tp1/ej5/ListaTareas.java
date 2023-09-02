package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaTareas {
    private ArrayList<Tarea> listaTareas = new ArrayList<>();

    public void crearListaTareas() {
        ListaTareas listaTareas = new ListaTareas();
    }
    public void crearTarea(String descripcion, Tarea.Prioridad prioridad, Tarea.Estado estado, LocalDate fechaLimite) {
        Tarea task = new Tarea(descripcion, prioridad, estado, fechaLimite);
        listaTareas.add(task);
    }

    public void mostrarLista() {
        for(Tarea tarea : listaTareas) {
            tarea.mostrarTarea();
        }
    }
    public Tarea buscarTarea(String titulo) {
        for (Tarea tarea : listaTareas) {
            if (tarea.buscar(titulo)) {
                return tarea;
            }
        }
        return null;
    }
    public void tareasOrdenadas() {

    }
}