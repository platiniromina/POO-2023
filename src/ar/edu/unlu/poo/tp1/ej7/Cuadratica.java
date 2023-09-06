package ar.edu.unlu.poo.tp1.ej7;

import java.util.ArrayList;

public class Cuadratica {
    private float coeficienteA;
    private float coeficienteB;
    private float coeficienteC;
    private float valorX;

    public Cuadratica(float a, float b, float c) {
        setCoeficienteA(a);
        setCoeficienteB(b);
        setCoeficienteC(c);
    }
    public void setCoeficienteA(float coeficienteA) {
        this.coeficienteA = coeficienteA;
    }
    public void setCoeficienteB(float coeficienteB) {
        this.coeficienteB = coeficienteB;
    }
    public void setCoeficienteC(float coeficienteC) {
        this.coeficienteC = coeficienteC;
    }
    public void setValorX(float valorX) {
        this.valorX = valorX;
    }
    public float getValorX() {
        return valorX;
    }

    public ArrayList<Float> calcularRaices() {
        float discriminante = (float) ((Math.pow(coeficienteB, 2)) - 4 * coeficienteA * coeficienteC);
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
        return (float) (coeficienteA * Math.pow(valorX, 2) + coeficienteB * x + coeficienteC);
    }

    public String mostrarCuadratica() {
        String ecuacion = "";

        // Coeficiente 'a'
        if (coeficienteA != 0) {
            if (coeficienteA != 1 && coeficienteA != -1) {
                ecuacion += coeficienteA;
            }
            ecuacion += "x^2";
        }

        // Coeficiente 'b'
        if (coeficienteB != 0) {
            if (coeficienteB > 0) {
                ecuacion += " + ";
                if (coeficienteB != 1) {
                    ecuacion += coeficienteB;
                }
            } else {
                ecuacion += " - ";
                if (coeficienteB != -1) {
                    ecuacion += -coeficienteB;
                }
            }
            ecuacion += "x";
        }

        // Término independiente 'c'
        if (coeficienteC != 0) {
            if (coeficienteC > 0) {
                ecuacion += " + ";
                ecuacion += coeficienteC;
            } else {
                ecuacion += " - ";
                ecuacion += -coeficienteC;
            }
        }
        return ecuacion;
    }
}
