package ar.edu.unlu.poo.tp1.ej3;

import ar.edu.unlu.poo.tp1.Nodo;
import ar.edu.unlu.poo.tp1.TipoElemento;

public class Pila {
    private Nodo tope;

    private Pila() {
        tope = new Nodo(null);
    }
    public Pila crearPila() {
        return new Pila();
    }
    public boolean estaVacia() {
        return tope == null;
    }
    public void apilar(int clave, Object valor) {
        Nodo nuevoNodo = new Nodo(clave, valor);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }
    public TipoElemento desapilar() {
        if (!estaVacia()) {
            Nodo topeActual = tope;
            TipoElemento elemento = topeActual.getDato();
            tope = topeActual.getSiguiente();
            return elemento;
        }
        return null;
    }
    public TipoElemento tope() {
        Nodo topeActual = tope;
        return topeActual.getDato();
    }
    /*public int longitudPila() {
        int longitud = 0;
        Nodo nodoAux = tope;
        while (nodoAux != null) {
            longitud++;
            nodoAux = nodoAux.getSiguiente();
        }
        return longitud;
    } */
    public int longitudPila() {
        int longitud = 0;
        Pila pilaAux = crearPila();
        Nodo nodoAux = tope;
        TipoElemento x = new TipoElemento();
        while (!estaVacia()) {
            x = desapilar();
            pilaAux.apilar(x.getClave(), x.getValor());
            longitud++;
        }
        while (!pilaAux.estaVacia()) {
            x = pilaAux.desapilar();
            apilar(x.getClave(), x.getValor());
        }
        return longitud;
    }
}
