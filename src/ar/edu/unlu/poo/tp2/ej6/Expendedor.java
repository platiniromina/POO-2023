package ar.edu.unlu.poo.tp2.ej6;

public class Expendedor {
    private int numero;
    private Combustible combustible;
    protected double totalVentas;
    protected double litrosExpendidos;

    public Expendedor(int numero, Combustible combustible){
        this.numero = numero;
        this.combustible = combustible;
        this.totalVentas = 0;
        this.litrosExpendidos = 0;
    }

    public Combustible getCombustible(){
        return this.combustible;
    }
}
