package ar.edu.unlu.poo.tp2.ej8;

public class Diario extends Publicacion {
    private String fechaPublicacion;

    public Diario(String nombre, String editor, String telefonoProveedor, String fechaPublicacion) {
        super(nombre, editor, telefonoProveedor);
        this.fechaPublicacion = fechaPublicacion;
    }
}