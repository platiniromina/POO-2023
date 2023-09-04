package ar.edu.unlu.poo.tp1.ej6;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String anio;
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

    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getAnio() {
        return anio;
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
    public int getEjemplaresDisponibles() {
        return ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public String verDescripcion() {
        String descripcion = String.format("Libro: %s / Autor: %s / ISBN: %s " +
                        "/ Año: %s / Páginas: %i \n" +
                        "Ejemplares disponibles: %i / Ejemplares prestados: %i",
                titulo, autor, isbn, anio, nroPaginas, ejemplares, ejemplaresPrestados);
        return descripcion;
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
