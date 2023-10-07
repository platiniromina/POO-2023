package ar.edu.unlu.poo.tp2.ej9;

public class Triangulo extends Figura2D {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
}
