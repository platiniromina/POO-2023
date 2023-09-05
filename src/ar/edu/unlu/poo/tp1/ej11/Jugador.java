package ar.edu.unlu.poo.tp1.ej11;

import ar.edu.unlu.poo.tp1.ej11.Palabra;

import java.util.ArrayList;

public class Jugador {
    private String username;
    private ArrayList<Palabra> palabrasJugadas;
    private int puntaje;

    public Jugador(String nombre) {
        setUsername(nombre);
        palabrasJugadas = new ArrayList<>();
        puntaje = 0;
    }
    public void setUsername(String name) {
        username = name;
    }
    public String getUsername() {
        return username;
    }
    public void setPuntaje(int puntos) {
        puntaje += puntos;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public int jugarPalabra(String palabra) {
        Palabra unaPalabra = new Palabra(palabra);
        setPuntaje(unaPalabra.getPuntaje());
        palabrasJugadas.add(unaPalabra);
        return unaPalabra.getPuntaje();
    }
}
