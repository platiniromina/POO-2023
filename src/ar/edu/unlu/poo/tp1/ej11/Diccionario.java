package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> diccionario = new ArrayList<>();

    public Diccionario() {
        cargarDiccionario();
    }
    public boolean palabraValida(String palabra) {
        return diccionario.contains(palabra);
    }
    private void agregarPalabra(String palabra) {
        diccionario.add(palabra.toLowerCase());
    }
    private void cargarDiccionario() {
        agregarPalabra("exquisito");
        agregarPalabra("zapato");
        agregarPalabra("kiosco");
        agregarPalabra("programacion");
        agregarPalabra("objetos");
        agregarPalabra("universidad");
        agregarPalabra("yoyo");
        agregarPalabra("estudiante");
    }
    public void mostrarDiccionario() {
        System.out.println("--- PALABRAS VÁLIDAS ---");
        for (String palabra : diccionario) {
            System.out.println(palabra);
        }
    }
}