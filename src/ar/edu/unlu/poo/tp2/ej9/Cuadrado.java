public class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double getArea() {
        return (float) Math.pow(lado, 2);
    }
}
