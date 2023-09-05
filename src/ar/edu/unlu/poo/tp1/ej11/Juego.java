package ar.edu.unlu.poo.tp1.ej11;

import java.util.Scanner;

public class Juego {
    Jugador jugador1;
    Jugador jugador2;
    Diccionario diccionario = new Diccionario();
    int turnos;
    Scanner buffer = new Scanner(System.in);
    public Juego() {
        crearJugadores();
        for (int i=1; i <= turnos; i++) {
            System.out.printf("\n---- TURNO NRO %d ----", i);
            turno(jugador1);
            turno(jugador2);
        }
        finJuego();
    }

    public void crearJugadores() {
        System.out.println("---- CREACIÓN DE JUGADORES ----");
        System.out.print("Ingresá el nombre del Jugador 1: ");
        jugador1 = new Jugador(buffer.nextLine());
        System.out.print("Ingresá el nombre del Jugador 2: ");
        jugador2 = new Jugador(buffer.nextLine());
        System.out.print("Ingresá cantidad de turnos: ");
        turnos = Integer.parseInt(buffer.nextLine());
    }
    public void turno(Jugador jugador) {
        String palabra;
        boolean valida;
        int puntos;

        System.out.printf("\n--> TURNO %s\n", jugador.getUsername());
        System.out.print("Ingresa palabra: ");
        palabra = buffer.nextLine();
        valida = comprobarPalabra(palabra);
        if (valida) {
            puntos = jugador.jugarPalabra(palabra);
            System.out.printf("La palabra <%s> suma %d puntos \n", palabra, puntos);
        }
        else {
            System.out.println("La palabra no es válida, no suma puntos\n");
        }
    }

    public boolean comprobarPalabra(String palabra) {
        return diccionario.palabraValida(palabra);
    }

    public void finJuego() {
        System.out.println("\n---- RESULTADOS FINALES ----");

        if (jugador1.getPuntaje() > jugador2.getPuntaje()) {
            System.out.printf("Gana %s con %d puntos!", jugador1.getUsername(), jugador1.getPuntaje());
        } else if (jugador2.getPuntaje() > jugador1.getPuntaje()) {
            System.out.printf("Gana %s con %d puntos!", jugador2.getUsername(), jugador2.getPuntaje());
        } else {
            System.out.printf("Empate! Ambos jugadores terminaron con %d puntos", jugador1.getPuntaje());
        }
    }
}