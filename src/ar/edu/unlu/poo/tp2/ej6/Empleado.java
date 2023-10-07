package ar.edu.unlu.poo.tp2.ej6;

public class Empleado {
    private String nombre;
    private String CUIT;
    protected double totalVentas;

    public Empleado(String nombre, String CUIT){
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.totalVentas = 0;
    }
}
