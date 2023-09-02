package ar.edu.unlu.poo.tp1.ej8;

import java.util.ArrayList;

public class Cuadratica {
    private float coeficienteA;
    private float coeficienteB;
    private float terminoInd;
    private float valorX;

    public Cuadratica(float a, float b, float c) {
        setCoeficienteA(a);
        setCoeficienteB(b);
        setTerminoInd(c);
    }
    public void setCoeficienteA(float coeficienteA) {
        this.coeficienteA = coeficienteA;
    }
    public void setCoeficienteB(float coeficienteB) {
        this.coeficienteB = coeficienteB;
    }
    public void setTerminoInd(float terminoInd) {
        this.terminoInd = terminoInd;
    }
    public void setValorX(float valorX) {
        this.valorX = valorX;
    }
    public float getValorX() {
        return valorX;
    }

    public ArrayList<Float> calcularRaices() {
        float discriminante = (float) ((Math.pow(coeficienteB, 2)) - 4 * coeficienteA * terminoInd);
        ArrayList<Float> raices = new ArrayList<>();
        if (discriminante < 0) {
            return null;
        }
        else if (discriminante == 0) {
            float resultado = -(coeficienteB) / (2 * coeficienteA);
            raices.add(resultado);
        }
        else {
            float raiz1 = (float) ((-coeficienteB + Math.sqrt(discriminante)) / 2 * coeficienteA);
            float raiz2 = (float) ((-coeficienteB - Math.sqrt(discriminante)) / 2 * coeficienteA);
            raices.add(raiz1);
            raices.add(raiz2);
        }
        return raices;
    }
    public float calcularY(float x) {
        setValorX(x);
        return (float) (coeficienteA * Math.pow(valorX, 2) + coeficienteB * x + terminoInd);
    }

    public void mostrarCuadratica() {
        String ecuacion = "";
        if (coeficienteA != 0) {
            ecuacion += coeficienteA + "x^2 ";
        }
        if (coeficienteB != 0) {
            ecuacion += coeficienteB + "x ";
        }
        if (terminoInd != 0) {
            ecuacion += terminoInd;
        }
        System.out.println(ecuacion);
    }
}
