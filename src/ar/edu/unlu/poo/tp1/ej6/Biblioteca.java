package ar.edu.unlu.poo.tp1.ej6;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(String newIsbn, String newTitulo, String newAutor, int newPags, int cantEjemplares) {
        Libro newLibro = new Libro(newIsbn, newTitulo, newAutor, newPags, cantEjemplares);
        libros.add(newLibro);
    }
    public String prestarLibro(String titulo) {
        Libro libroBuscado = buscar(titulo);
        if (libroBuscado.prestar()) {
            return "Se prestó el libro <" + libroBuscado.getTitulo() + "> " +
                    "y quedan " + libroBuscado.getEjemplaresDisponibles() + " ejemplares disponbles";
        }
        return "No se pudo prestar <" + libroBuscado.getTitulo() + "> porque quedaba un sólo ejemplar disponible";
    }

    public Libro buscar(String titulo) { // sobrecargar para buscar por titulo, autor
        for(Libro l: libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
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

    public String mostrarLibro(String libro) {
        Libro l = buscar(libro);
        if (l != null) {
            return l.verDescripcion();
        }
        return "Ese libro no existe en la biblioteca";
    }

    public int consultarPaginasLibro(String libro) {
        Libro l = buscar(libro);
        if (l != null) {
            return l.getNroPaginas();
        }
        return -1;
    }
}

