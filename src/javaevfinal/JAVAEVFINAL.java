/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaevfinal;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author a
 */
public class JAVAEVFINAL {

    /**
     * @param args the command line arguments
     */
    
    Scanner sc = new Scanner(System.in);
    
     public void menu() throws FileNotFoundException{
        System.out.println("Ingrese la operación a realizar");
        System.out.println("1. Dar de alta doctores");
        System.out.println("2. Dar de alta pacientes");
        System.out.println("3. Crear citas");
        System.out.println("4. Relacionar citas");
        
        int opcion;
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                darAltaDoctores();
                break;
            case 2:
                darAltaPacientes();
                break;
            case 3:
                crearCitas();
                break;
            case 4:
                relacionarCitas();
                break;
            default:
                System.out.println("Error");
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        
        JAVAEVFINAL menu = new JAVAEVFINAL();
        menu.mainmenu();
        
    }
    
    public void mainmenu() throws FileNotFoundException{
        System.out.println("Ingrese la operación a realizar");
        System.out.println("1. Dar de alta doctores");
        System.out.println("2. Dar de alta pacientes");
        System.out.println("3. Crear citas");
        System.out.println("4. Relacionar citas");
        
        int opcion;
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                darAltaDoctores();
                break;
            case 2:
                darAltaPacientes();
                break;
            case 3:
                crearCitas();
                break;
            case 4:
                relacionarCitas();
                break;
            default:
                System.out.println("Error");
        }
        
    }
    
    public void darAltaDoctores() throws FileNotFoundException{
        int id;
        String name;
        System.out.println("Ingrese Id del Doctor");
        id=sc.nextInt();
        System.out.println("Ingrese nombre del Doctor");
        name=sc.next();
        Doctor doctor = new Doctor(id, name);
        
        try (PrintWriter out = new PrintWriter("filenameDoctors.txt")) {
        out.println(id);
        out.println(name);
}
    }
    
    public void darAltaPacientes() throws FileNotFoundException{
        int id;
        String name;
        System.out.println("Ingrese Id del Paciente");
        id=sc.nextInt();
        System.out.println("Ingrese nombre del Paciente");
        name=sc.next();
        Paciente paciente = new Paciente(id, name);
        try (PrintWriter out = new PrintWriter("Pacientes.txt")) {
        out.println(id);
        out.println(name);
    }}
    
    public void crearCitas() throws FileNotFoundException{
        int id;
        String dat;
        System.out.println("Ingrese Id de cita");
        id=sc.nextInt();
        System.out.println("Ingrese fecha de cita");
        dat=sc.next();
        Cita cita = new Cita(id, dat);
               try (PrintWriter out = new PrintWriter("Citas.txt")) {
        out.println(id);
        out.println(dat);
       
    }}
    public void relacionarCitas() throws FileNotFoundException{
        int idDoc, idPacient, idCita;
        System.out.println("Ingrese ID de Doctor");
        idDoc = sc.nextInt();
        System.out.println("Ingrese ID de Paciente");
        idPacient = sc.nextInt();
        System.out.println("Ingrese ID de Cita");
        idCita = sc.nextInt();
        System.out.println("Datos guardados");
        try (PrintWriter out = new PrintWriter("filenameRelacionados.txt")) {
        out.println(idDoc);
        out.println(idPacient);
        out.println(idCita);
        
        
    }}
}
