public class ListaEnlazada {
    private Nodo inicio;

    private ListaEnlazada() {
        inicio = new Nodo(null);
    }
    public ListaEnlazada crearLista() {
        return new ListaEnlazada();
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
        }
    }
    public void eliminarClave(int clave) {
        if (estaVacia()) {
            return;
        }
        while (inicio != null && inicio.getDato().getClave() == clave) {
            inicio = inicio.getSiguiente();
        }
        Nodo nodoAux = inicio;
        while (nodoAux != null && nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
            if (nodoAux.getSiguiente().getDato().getClave() == clave) {
                Nodo nodoTemp = nodoAux.getSiguiente();
                nodoAux.setSiguiente(nodoTemp.getSiguiente());
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
            }
        }
        else {
            for (int i=0; i< pos - 2; i++) {
                actual = actual.getSiguiente();
            }
            Nodo nodoTemp = actual.getSiguiente();
            actual.setSiguiente(nodoTemp.getSiguiente());
        }
    }
    public TipoElemento recuperar(int pos) {
        Nodo actual = inicio;
        for (int i=0; i< pos - 1; i++) {
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
            }
        }
        else {
            Nodo actual = inicio;
            for (int i=0; i < pos - 2; i++) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente()); ;
            actual.setSiguiente(nuevoNodo);
        }
    }
}
