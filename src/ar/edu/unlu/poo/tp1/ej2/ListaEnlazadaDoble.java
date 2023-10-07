package ar.edu.unlu.poo.tp1.ej2;

import ar.edu.unlu.poo.tp1.Nodo;
import ar.edu.unlu.poo.tp1.TipoElemento;

public class ListaEnlazadaDoble {
    private Nodo inicio;

    private ListaEnlazadaDoble() {
        inicio = new Nodo(null);
    }
    public ListaEnlazadaDoble crearLista() {
        return new ListaEnlazadaDoble();
    }
    public boolean estaVacia() {
        return inicio == null;
    }
    public int longitudLista() {
        Nodo nodoAux = inicio;
        int cantidad = 0;
        while (nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
            cantidad++;
        }
        return cantidad;
    }
    public void agregar(int clave, Object valor) {
        Nodo nuevoNodo = new Nodo(clave, valor);
        if (estaVacia()) {
            inicio = nuevoNodo;
        }
        else {
            Nodo nodoAux = inicio;
            while (nodoAux.getSiguiente() != null) {
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
        }
    }
    public void eliminarClave(int clave) {
        if (estaVacia()) {
            return;
        }
        while (inicio != null && inicio.getDato().getClave() == clave) {
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
        Nodo nodoAux = inicio;
        while (nodoAux != null && nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
            if (nodoAux.getDato().getClave() == clave) {
                Nodo nodoAnterior = nodoAux.getAnterior();
                Nodo nodoPosterior = nodoAux.getSiguiente();
                nodoAnterior.setSiguiente(nodoPosterior);
                nodoPosterior.setAnterior(nodoAnterior);
            }
        }
    }
    public void eliminarPos(int pos) {
        if (estaVacia()) {
            return;
        }
        Nodo actual = inicio;
        if (pos >= 1 && pos <= longitudLista()) {
            if (pos == 1) {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
        else {
            for (int i=0; i < pos - 1; i++) {
                actual = actual.getSiguiente();
            }
            Nodo nodoAnterior = actual.getAnterior();
            Nodo nodoPosterior = actual.getSiguiente();
            nodoAnterior.setSiguiente(nodoPosterior);
            nodoPosterior.setAnterior(nodoAnterior);
        }
    }
    public TipoElemento recuperar(int pos) {
        Nodo actual = inicio;
        for (int i=0; i < pos - 1; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }
    public void insertar(int clave, Object valor, int pos) {
        Nodo nuevoNodo = new Nodo(clave, valor);
        if (pos >= 1 && pos <= longitudLista()) {
            if (pos == 1) {
                Nodo nodoAux = inicio;
                nuevoNodo.setSiguiente(nodoAux);
                inicio = nuevoNodo;
                nodoAux.setAnterior(inicio);
                inicio.setAnterior(null);
            }
        }
        else {
            Nodo actual = inicio;
            for (int i=0; i < pos - 1; i++) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual);
            nuevoNodo.setAnterior(actual.getAnterior());
            actual.setAnterior(nuevoNodo);
        }
    }
}

