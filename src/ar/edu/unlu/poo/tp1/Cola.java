public class Cola {
    private Nodo frente = null;
    private Nodo ultimo = null;

    public Cola crearCola() {
        return new Cola();
    }
    public void encolar(int clave, Object valor) {
        Nodo nuevoNodo = new Nodo(clave, valor);
        if (esVacia()) {
            frente = nuevoNodo;
        }
        else {
            ultimo.setSiguiente(nuevoNodo);
        }
    }
    public TipoElemento desencolar() {
        if (esVacia()) {
            return null;
        }
        Nodo inicio = frente;
        TipoElemento elemento = inicio.getDato();
        frente = inicio.getSiguiente();
        return elemento;
    }
    public boolean esVacia() {
        return frente == null;
    }
    public TipoElemento recuperar() {
        if (esVacia()) {
            return null;
        }
        return frente.getDato();
    }


}
