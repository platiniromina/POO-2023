package ar.edu.unlu.poo.tp1.ej9;

import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    public void setFecha(String formato) {
        fecha = LocalDate.parse(formato);
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public boolean entreFechas(Fecha fecha1, Fecha fecha2) {
        return fecha.isAfter(fecha1.getFecha()) && fecha.isBefore(fecha2.getFecha());
    }
    public boolean mayorA(Fecha otraFecha) {
        return fecha.isAfter(otraFecha.getFecha());
    }
    public boolean menorA(Fecha otraFecha) {
        return fecha.isBefore(otraFecha.getFecha());
    }
}
