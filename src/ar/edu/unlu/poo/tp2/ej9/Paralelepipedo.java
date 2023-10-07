package ar.edu.unlu.poo.tp2.ej9;

public class Paralelepipedo extends Figura3D {
    private double ancho;
    private double base;
    private double altura;

    public Paralelepipedo(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return 2 * (ancho * base + ancho * altura + base * altura);
    }
    @Override
    public double getVolumen() {
        return ancho * base * altura;
    }
}
