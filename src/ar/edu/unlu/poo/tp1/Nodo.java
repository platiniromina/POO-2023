public class Nodo {
    private TipoElemento dato = new TipoElemento();
    private Nodo siguiente = null;
    private Nodo anterior = null;

    public Nodo(Integer clave, Object valor) {
        setDato(clave, valor);
    }
    public Nodo(Integer clave) {
        setDato(clave, null);
    }

    public void setDato(Integer clave) {
        dato.setClave(clave);
        dato.setValor(null);
    }
    public void setDato(Integer clave, Object valor) {
        dato.setClave(clave);
        dato.setValor(valor);
    }

    public TipoElemento getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
