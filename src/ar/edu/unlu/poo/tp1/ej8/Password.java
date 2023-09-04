package ar.edu.unlu.poo.tp1.ej8;

public class Password {
    private static final String letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String letrasMinus = "abcdefghijklmnopqrstuvwxyz";
    private static final String numeros = "0123456789";
    private static final int defaultLength = 8;
    private StringBuilder password;
    private int longitud;
    private boolean fuerte;

    public Password() {
        this.password = new StringBuilder(defaultLength);
        this.longitud = defaultLength;
        generarPassword();
        fuerte = passwordFuerte();
    }
    public Password(int longitud) {
        this.password = new StringBuilder(longitud);
        this.longitud = longitud;
        generarPassword();
        fuerte = passwordFuerte();
    }
    public int getLongitud() {
        return longitud;
    }
    public void modificarLongitud() {

    }

    public void generarPassword() {
        int random;
        for (int i=0; i < longitud; i++) {
            random = (int) (Math.random() * 3);
            switch (random) {
                case 0 -> {
                    random = (int) (Math.random() * letrasMayus.length());
                    password.append(letrasMayus.charAt(random));
                }
                case 1 -> {
                    random = (int) (Math.random() * letrasMinus.length());
                    password.append(letrasMinus.charAt(random));
                }
                case 2 -> {
                    random = (int) (Math.random() * numeros.length());
                    password.append(numeros.charAt(random));
                }
            }
        }
    }
    public boolean passwordFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;
        for (int i=0; i < longitud; i++) {
            char caracter = password.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            }
            else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else
                numeros++;
        }
        return (mayusculas > 2) && (minusculas > 1) && (numeros >= 2);
    }
    public String verPassword() {
        if (fuerte) {
            return "<" + password + "> - Fuerte";
        } else
            return "<" + password + "> - Débil";
    }
    public boolean debeRegenerar() {
        if (fuerte) {
            return false;
        }
        regenerarPassword();
        return true;
    }
    public void regenerarPassword() {
        while (!fuerte) {
            password = new StringBuilder();
            generarPassword();
            fuerte = passwordFuerte();
        }
    }
}
