package ar.edu.unlu.poo.tp1.ej9;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Fecha fechita = new Fecha();
        fechita.setFecha("1999-04-29");
        DateTimeFormatter diaMesAnio = DateTimeFormatter.ofPattern("dd MM yyyy");
        String formato1 = fechita.getFecha().format(diaMesAnio);
        System.out.println(formato1);

    }


}
