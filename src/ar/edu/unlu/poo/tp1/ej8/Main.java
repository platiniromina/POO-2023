package ar.edu.unlu.poo.tp1.ej8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantPasswords;
        String longitud;
        Scanner sc = new Scanner(System.in);
        System.out.println("*** GENERADOR DE CONTRASEÑAS ***");
        System.out.println("Ingresá cantidad de contraseñas a generar: ");
        cantPasswords = sc.nextInt();
        System.out.println("Ingresá longitud de las contraseñas (Enter para longitud default = 8): ");
        longitud = sc.nextLine();

        ListaPasswords passes = new ListaPasswords(cantPasswords, longitud);
        // mostrar listado de passwords y su fuerza
        passes.mostrarPasswords();
        System.out.println("\nRegenerar contraseñas débiles? S-N: ");
        String continuar = sc.nextLine();
        if (continuar.equalsIgnoreCase("s")) {
            passes.regenerarDebiles();
            passes.mostrarPasswords();
        }
        else {
            System.out.println("*** TERMINADO ***");
        }


    }
}
