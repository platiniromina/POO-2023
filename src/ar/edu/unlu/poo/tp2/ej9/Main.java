import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura2D> formas2D = new ArrayList<>();
        formas2D.add(new Circulo(5.0));
        formas2D.add(new Rectangulo(3.0, 4.0));

        List<Figura3D> formas3D = new ArrayList<>();
        formas3D.add(new Esfera(3.0));
        formas3D.add(new Paralelepipedo(2.0, 3.0, 4.0));

        for (Figura2D forma : formas2D) {
            System.out.println("Área: " + forma.getArea());
        }

        for (Figura3D forma : formas3D) {
            System.out.println("Volumen: " + forma.getVolumen());
        }
    }
}
