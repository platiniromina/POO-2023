package ar.edu.unlu.poo.tp1.ej6;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(String newIsbn, String newTitulo, String newAutor, int newPags, int cantEjemplares) {
        Libro newLibro = new Libro(newIsbn, newTitulo, newAutor, newPags, cantEjemplares);
        libros.add(newLibro);
    }
    public boolean prestarLibro(String titulo) {
        Libro libroBuscado = buscar(titulo);
        return libroBuscado.prestar();
    }

    public Libro buscar(String titulo) { // sobrecargar para buscar por titulo, autor
        for(Libro l: libros) {
            if (l.getTitulo().equals(titulo)) {
                return l;
            }
        }
        return null;
    }

    public int verPrestamos() {
        int prestados = 0;
        for(Libro l: libros) {
            prestados += l.getEjemplaresPrestados();
        }
        return prestados;
    }

    public void mostrarLibro(Libro l) {
        System.out.println(l.verDescripcion());
    }
}

