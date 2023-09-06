package ar.edu.unlu.poo.tp1.ej5;

import java.util.ArrayList;

public class Colaborador {
    private String nombre;
    private ArrayList<Tarea> tareasColaborador = new ArrayList<>();

    public Colaborador(String nombre) {
        setNombre(nombre);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareasColaborador.add(tarea);
    }
    public void mostrarTareas() {
        for (Tarea tarea : tareasColaborador) {
            System.out.println(tarea);
        }
    }
}
