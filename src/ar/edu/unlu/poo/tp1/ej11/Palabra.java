package ar.edu.unlu.poo.tp1.ej11;

public class Palabra {
    private static final String letrasEspeciales = "kzxywq";
    private String palabra;
    private int puntaje;

    public Palabra(String palabra) {
        this.palabra = palabra;
        puntaje = 0;
        calcularPuntaje();
    }
    public String getPalabra() {
        return palabra;
    }
    public int getPuntaje() {
        return puntaje;
    }
    private void calcularPuntaje() {
        puntaje = palabra.length();
        for (char letra : palabra.toCharArray()) {
            if (letrasEspeciales.indexOf(letra) != -1) {
                puntaje++;
            }
        }
    }
}
