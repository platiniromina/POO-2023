package ar.edu.unlu.poo.tp1.ej6;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private Integer nroPaginas;
    private Integer ejemplares;
    private Integer ejemplaresPrestados = 0;

    public Libro(String isbn, String titulo, String autor, int nroPaginas, int cantEjemplares) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setNroPaginas(nroPaginas);
        setEjemplares(cantEjemplares);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public int getEjemplaresDisponibles() {
        return ejemplares - ejemplaresPrestados;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public String verDescripcion() {
        return String.format("Libro: %s / Autor: %s / ISBN: %s " +
                        "/ Páginas: %d \n" +
                        "Ejemplares disponibles: %d / Ejemplares prestados: %d",
                titulo, autor, isbn, nroPaginas, getEjemplaresDisponibles(), ejemplaresPrestados);
    }

    public boolean prestar() {
        if (ejemplaresPrestados < ejemplares -1) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }
}
