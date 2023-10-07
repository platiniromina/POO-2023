package ar.edu.unlu.poo.tp2.ej1;

import java.util.ArrayList;

public class Suscripcion {
    public enum Nivel {
        BASICA, INTERMEDIA, DESTACADA
    }
    private Nivel nivel;
    public ArrayList<Actividad> actividades;
    private double valorCuota;

    public Suscripcion(Nivel nivel, double valorCuota) {
        this.nivel = nivel;
        this.valorCuota = valorCuota;
        actividades = new ArrayList<>();
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    public Nivel getNivel() {
        return nivel;
    }
    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }
    public double getValorCuota() {
        return valorCuota;
    }
}
