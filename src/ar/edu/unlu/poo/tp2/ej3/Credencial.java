package ar.edu.unlu.poo.tp2.ej3;

public class Credencial {
    private String id;

    private Comision comision;
    private Disciplina disciplina;

    public Credencial(Comision c,Disciplina d){

        this.comision=c;
        this.disciplina=d;
        id = generarId();
    }

    public Comision getComision() {
        return comision;
    }

    public  void regAsistencia(){
        comision.regAsistencia(this);
        disciplina.regAsistencia(this);
    }


    private String generarId() {
        String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz1234567890";
        StringBuilder contra = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            double aleatorio = Math.random() * 27;
            int posicion = (int) aleatorio;
            char letra = cadena.charAt(posicion);
            contra.append(letra);
        }
        for (int i = 0; i < 9; i++) {
            double aleatorio = Math.random() * 27;
            int posicion = (int) aleatorio;
            char letra = cadena.charAt(posicion + 27);
            contra.append(letra);
        }
        for (int i = 0; i < 8; i++) {
            double aleatorio = Math.random() * 10;
            int posicion = (int) aleatorio;
            char letra = cadena.charAt(posicion + 54);
            contra.append(letra);
        }

        return contra.toString();
    }



}
