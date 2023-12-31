package ar.edu.unlu.poo.tp1.ej7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cuadratica ecuacion = new Cuadratica(-1, -1, 2);
        System.out.print("Ecuación ingresada: ");
        System.out.println(ecuacion.mostrarCuadratica());
        ArrayList<Float> raices = ecuacion.calcularRaices();
        float y = ecuacion.calcularY(2);

        // muestro raíces
        if (raices != null) {
            if (raices.size() == 1) {
                System.out.print("Raíz: ");
            } else {
                System.out.print("Raíces: ");
            }
            for (Float raiz : raices) {
                System.out.printf("%.1f; ", raiz);
            }
            System.out.print("\n");
        }
        else {
            System.out.println("La ecuación no tiene raíces reales");
        }
        // resultado de reemplazar la x con algún valor
        System.out.printf("Resultado f(x) con x = %.1f: %.1f", ecuacion.getValorX(), y);
    }
}
