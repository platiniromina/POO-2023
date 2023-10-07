package ar.edu.unlu.poo.tp2.ej3;

import java.util.ArrayList;

public class Comision {
    private String id;
    private String nivel;
    private Salon salon;

    private ArrayList<String> dias=new ArrayList<>();
    private ArrayList<String> horario=new ArrayList<>();
    private Profesor tutor;
    private Integer asistencias=0;
    private ArrayList<Credencial>credencialesValidas=new ArrayList<>();

    public Comision(ArrayList<String> horario,ArrayList<String> dias ,Profesor tutor,String nivel,Salon salon,String disciplina,Integer comision){
        this.dias=dias;
        this.horario=horario;
        this.nivel=nivel;
        this.tutor=tutor;
        this.id=(disciplina+"_"+comision.toString());
        this.salon=salon;
    }
    public void  reiniciarAsistencias(){
        asistencias=0;
    }
    public void regAsistencia(Credencial cre){
        if (credencialesValidas.contains(cre)){
            asistencias++;
        }
    }

    public void nuevoAlumno(Credencial cre){
        if (!credencialesValidas.contains(cre)){
            credencialesValidas.add(cre);
            return;
        }
        System.out.println("El alumno fue registrado anteriormente");
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public String getId() {
        return id;
    }

    public ArrayList<String> getHorario() {
        return horario;
    }
}
