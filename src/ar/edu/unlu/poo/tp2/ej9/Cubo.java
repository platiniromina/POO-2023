package ar.edu.unlu.poo.tp2.ej9;

public class Cubo extends Figura3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double getVolumen() {
        return Math.pow(lado, 3);
    }
}
