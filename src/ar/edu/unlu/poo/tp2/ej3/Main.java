package ar.edu.unlu.poo.tp2.ej3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
     static String verificarDia(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nDia de la semana(L/M/X/J/V/S/D): ");
        String dia=sc.nextLine();
        while(!(dia.equalsIgnoreCase("l")||dia.equalsIgnoreCase("m")||dia.equalsIgnoreCase("x")||dia.equalsIgnoreCase("j")||dia.equalsIgnoreCase("v")||dia.equalsIgnoreCase("s")||dia.equalsIgnoreCase("d")||dia.equalsIgnoreCase("lunes")||dia.equalsIgnoreCase("martes")||dia.equalsIgnoreCase("miercoles")||dia.equalsIgnoreCase("jueves")||dia.equalsIgnoreCase("viernes")||dia.equalsIgnoreCase("sabado")||dia.equalsIgnoreCase("domingo"))){
            System.out.print("\nERROR");
            System.out.print("\nDia de la semana(L/M/X/J/V/S/D): ");
             dia=sc.nextLine();
        }
        switch (dia){
            case "l":
                dia="lunes";
                break;
            case "m":
                dia="martes";
                break;
            case "x":
                dia="miercoles";
                break;
            case "j":
                dia="jueves";
                break;
            case "s":
                dia="sabado";
                break;
            case "d":
                dia="domingo";
                break;
        }
        dia.toUpperCase(Locale.ROOT);
        return dia;
    }
    public static int menu()
    {

        System.out.println("\n1 - **Crear un salon**");
        System.out.println("2 - **Dar de alta un profesor**");
        System.out.println("3 - **Dar de alta un alumno**");
        System.out.println("4 - **Dar de alta una disciplina**");
        System.out.println("5 - **Dar de alta una comision**");
        System.out.println("6 - **Inscribir un alumno a una comision**");
        System.out.println("7 - **Registrar asistencia**");
        System.out.println("8 - **Reiniciar mes**");
        System.out.println("0 - **Salir**");
        System.out.println("");
        System.out.print("Opcion: ");
        Scanner scanner=new Scanner(System.in);
        int opcion= scanner.nextInt();
        return opcion;

    }
    public static void main(String[] args)
    {
        Secretaria sec= new Secretaria();
        Scanner sc= new Scanner(System.in);

        int opcion =menu();
        while   (opcion<0||opcion>8)
        {
            opcion=menu();
        }
        while (opcion!=0)
        {
            switch (opcion) {
                case 1:
                    System.out.println("------Crear salon------");
                    System.out.print("Ingresa el id del salon: ");
                    sc= new Scanner(System.in);
                    sec.darAltaSalon(sc.nextLine());
                    break;
                case 2:
                    System.out.println("------Dar de alta profesor------");
                    System.out.print("Ingresar nombre del profesor: ");
                    String nombre;
                    sc= new Scanner(System.in);
                    nombre=sc.nextLine();
                    System.out.print("\nIngresar apellido del profesor: ");
                    sc= new Scanner(System.in);
                    String apellido=sc.nextLine();
                    System.out.print("\nIngresar DNI del profesor: ");
                    sc= new Scanner(System.in);
                    String dni=sc.nextLine();
                    sec.darAltaProfesor(nombre,apellido,dni);

                    break;
                case 3:
                    System.out.println("------Dar de alta alumno------");
                    System.out.print("Ingresar nombre del alumno: ");
                    sc= new Scanner(System.in);
                    nombre=sc.nextLine();
                    System.out.print("\nIngresar apellido del alumno: ");
                    sc= new Scanner(System.in);
                    apellido=sc.nextLine();
                    System.out.print("\nIngresar DNI del alumno: ");
                    sc= new Scanner(System.in);
                    dni=sc.nextLine();
                    sec.darAltaAlumno(nombre,apellido,dni);
                    break;
                case 4:
                    System.out.println("------Dar de alta disciplina------");
                    System.out.print("Ingresar nombre de la disciplina: ");
                    sc= new Scanner(System.in);
                    nombre=sc.nextLine();
                    System.out.print("\nIngresar programa de la disciplina: ");
                    sc= new Scanner(System.in);
                    String programa=sc.nextLine();
                    sec.darAltaDisciplina(nombre,programa);
                    break;

                case 5:
                    System.out.println("------Dar de alta comision------");
                    System.out.print("Ingresar nombre de la disciplina: ");
                    sc= new Scanner(System.in);
                    nombre=sc.nextLine();
                    System.out.print("\nIngresar dias y horarios ");
                    System.out.print("\nCuantas veces a la semana: ");
                    sc= new Scanner(System.in);
                    int veces= sc.nextInt();
                    ArrayList<String> dias=new ArrayList<>();
                    ArrayList<String> horario=new ArrayList<>();
                    for (int i=0;i<veces;i++){

                        String sdia=verificarDia();

                        System.out.print("\nIngresar horario: ");
                        sc= new Scanner(System.in);

                        String shorario=sc.nextLine();
                        dias.add(sdia);
                        horario.add(shorario);
                    }

                    System.out.print("\nIngresar dni del tutor: ");
                    sc= new Scanner(System.in);
                    String tutor=sc.nextLine();
                    System.out.print("\nIngresar nivel de la asignatura (inicial, intermedio o avanzado): ");
                    sc= new Scanner(System.in);
                    String nivel=sc.nextLine();
                    while (!((nivel.equalsIgnoreCase("inicial"))|| (nivel.equalsIgnoreCase("intermedio") )|| (nivel.equalsIgnoreCase("avanzado")))){
                        System.out.print("\n ERROR Ingresar nivel de la asignatura (inicial, intermedio o avanzado): ");
                        sc= new Scanner(System.in);
                        nivel=sc.nextLine();
                    }
                    System.out.print("\nIngresar salon: ");
                    sc= new Scanner(System.in);
                    String salon=sc.nextLine();
                    sec.darAltaComision(nombre,dias,horario,salon,nivel,tutor);
                    break;
                case 6:
                    System.out.println("------Inscribir un alumno------");
                    System.out.print("Ingresar DNI del alumno: ");
                    sc= new Scanner(System.in);
                    String alumno=sc.nextLine();
                    System.out.print("\nIngresar disciplina: ");
                    sc= new Scanner(System.in);
                    String disciplina=sc.nextLine();
                    System.out.print("\n:Ingresar comision "+disciplina+"_");
                    sc= new Scanner(System.in);
                    Integer com=sc.nextInt();
                    sec.inscribirAlumno(alumno,disciplina,com);
                    break;

                case 7:
                    System.out.println("------Registrar asistencia------");
                    System.out.print("Ingresar DNI del alumno: ");
                    sc= new Scanner(System.in);
                    alumno=sc.nextLine();
                    System.out.print("\nIngresar disciplina: ");
                    sc= new Scanner(System.in);
                    disciplina=sc.nextLine();
                    System.out.print("\n:Ingresar comision "+disciplina+"_");
                    sc= new Scanner(System.in);
                    com=sc.nextInt();
                    sec.registrarAsistencia(alumno,disciplina,com);

                    break;

                case 8:
                    sec.finMes();
                    break;

            }
            opcion=menu();
        }


    }
}
