package ar.edu.unlu.poo.tp1.ej8;

import java.util.ArrayList;

public class ListaPasswords {
    private ArrayList<Password> passwords = new ArrayList<>();

    public ListaPasswords(int cantPasswords, String longitud) {
        if (longitud.isEmpty()) {
            for (int i=0; i < cantPasswords; i++) {
                Password password = new Password();
                passwords.add(password);
            }
        }
        else {
            for (int i=0; i < cantPasswords; i++) {
                Password password = new Password(Integer.parseInt(longitud));
                passwords.add(password);
            }
        }
    }
    public void mostrarPasswords() {
        for (Password password : passwords) {
            System.out.println(password.verPassword());
        }
    }
    public void regenerarDebiles() {
        for (Password password : passwords) {
            if (password.debeRegenerar()) {
                System.out.println("Contraseña regenerada: " + password.verPassword());
            }
        }
    }
}
