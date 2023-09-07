package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {
    public enum Prioridad {
        BAJA, MEDIA, ALTA
    }
    public enum Estado {
        COMPLETA, INCOMPLETA
    }
    private String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaCompletada;
    private Colaborador user;

    public Tarea(String descripcion, Prioridad prioridad, Estado estado, String fechaLimite, String fechaRecordatorio) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        setDescripcion(descripcion);
        setPrioridad(prioridad);
        setEstado(estado);
        setFechaLimite(LocalDate.parse(fechaLimite, formato));
        setFechaRecordatorio(LocalDate.parse(fechaRecordatorio, formato));
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
    public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }
    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }
    public void setFechaCompletada(LocalDate dia) {
        fechaCompletada = dia;
    }

    public LocalDate getFechaCompletada() {
        return fechaCompletada;
    }

    public void setUser(Colaborador user) {
        this.user = user;
    }
    public Colaborador getUser() {
        return user;
    }

    public String mostrarTarea() {
        LocalDate hoy = LocalDate.now();
        if (estaVencida()) {
            return "(Vencida) " + getDescripcion();
        } else if (estaPorVencer()) {
            return "(Por vencer) " + getDescripcion();
        }
        else if (estaCompleta()) {
            return "(Terminada) " + getDescripcion();
        } else {
            return getDescripcion();
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
    public boolean estaPorVencer() {
        LocalDate hoy = LocalDate.now();
        return fechaRecordatorio.isEqual(hoy) || fechaRecordatorio.isBefore(hoy);
    }
    public boolean buscar(String dato) {
        String tituloBuscado = dato.toLowerCase();
        String titulo = getDescripcion().toLowerCase();
        return tituloBuscado.contains(titulo);
    }

}

// fechaLimite = LocalDate.of(año, mes, dia);