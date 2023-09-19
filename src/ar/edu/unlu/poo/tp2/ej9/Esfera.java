public class Esfera extends Figura3D {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getVolumen() {
        return ((double) 4 /3) * Math.PI * Math.pow(radio, 3);
    }
}
