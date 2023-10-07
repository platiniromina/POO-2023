package ar.edu.unlu.poo.tp2.ej1;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaClub {
    private ArrayList<Socio> socios;
    private Suscripcion suscripcionBasica;
    private Suscripcion suscripcionIntermedia;
    private Suscripcion suscripcionDestacada;

    private SistemaClub() {
        suscripcionBasica = new Suscripcion(Suscripcion.Nivel.BASICA, 100);
        suscripcionIntermedia = new Suscripcion(Suscripcion.Nivel.INTERMEDIA, 200);
        suscripcionDestacada = new Suscripcion(Suscripcion.Nivel.DESTACADA, 300);
    }
    public void agregarSocio(String nombre, String apellido, String dni, String direccion,
                             String email, String suscripcion) {
        Suscripcion.Nivel nivelSuscripcion = Suscripcion.Nivel.valueOf(suscripcion.toUpperCase());
        Socio nuevoSocio = new Socio(nombre, apellido, dni, direccion, email, nivelSuscripcion);
        socios.add(nuevoSocio);
    }
    public void reporteMensual(int mes) {
        System.out.println("--- REPORTE MENSUAL mes %d ---");
        System.out.println("Socios inscriptos:");
        for (Socio socio : socios) {
            int mesInscripcion = socio.getFechaInscripcion().getMonthValue();
            if (mesInscripcion == mes) {
                System.out.println(socio.toString());
            }
        }
    }

    public void actividadesPorSuscripcion() {
        System.out.println("--- ACTIVIDADES POR SUSCRIPCION ---");
        System.out.println("Suscripcion básica:");
        for (Actividad actividad : suscripcionBasica.actividades) {
            System.out.println(actividad.getDescripcion());
        }
        System.out.println("Suscripcion intermedia:");
        for (Actividad actividad : suscripcionIntermedia.actividades) {
            System.out.println(actividad.getDescripcion());
        }
        System.out.println("Suscripcion destacada:");
        for (Actividad actividad : suscripcionDestacada.actividades) {
            System.out.println(actividad.getDescripcion());
        }
    }
}
