package ar.edu.unlu.poo.tp1.ej5;
import java.time.LocalDate;
import java.util.Arrays;

enum Prioridad {
    ALTA, MEDIA, BAJA;
}
enum Estado {
    INCOMPLETA, COMPLETA;
}

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, Prioridad prioridad, Estado estado, LocalDate fechaLimite) {
        setDescripcion(descripcion);
        setPrioridad(prioridad);
        setEstado(estado);
        setFechaLimite(fechaLimite);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
    public Prioridad getPrioridad() {
        return prioridad;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public void mostrarTarea() {
        if (estaVencida()) {
            System.out.println("(Vencida) " + getDescripcion());
        } else {
            System.out.println(getDescripcion());
        }
    }
    public boolean estaVencida() {
        if(estado.equals(Estado.COMPLETA)) {
            return false;
        }
        LocalDate hoy = LocalDate.now();
        return (hoy.isAfter(fechaLimite));
    }
    public boolean estaCompleta() {
        return estado.equals(Estado.COMPLETA);
    }
    public boolean buscar(String dato) {
        String tituloBuscado = dato.toLowerCase();
        String titulo = getDescripcion().toLowerCase();
        return tituloBuscado.contains(titulo);
    }

}

// fechaLimite = LocalDate.of(año, mes, dia);