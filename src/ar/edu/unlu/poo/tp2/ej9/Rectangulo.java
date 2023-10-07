package ar.edu.unlu.poo.tp2.ej9;

public class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return base * 2 + altura * 2;
    }
}
