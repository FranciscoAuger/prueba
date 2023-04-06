/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class ServP {
    Scanner sc=new Scanner(System.in);
    public Persona crearP(){
        Persona p1=new Persona();
        long edad;
        
        System.out.println("Ingrese el nombre de la persona");
            p1.setNombre(sc.next());
            System.out.println("Ingrese el dia de nacimiento");
            int dia=sc.nextInt();
            System.out.println("Ingrese el mes de nacimiento");
            int mes =sc.nextInt();
            mes--;
            System.out.println("Ingrese año de nacimiento");
            int anio=sc.nextInt();
            anio=anio-1900;
            Date fecha=new Date(anio,mes,dia);
            p1.setFechaNac(fecha);
            return p1;
        
   
    
}
    public int edad(Persona p1){
        
        int edad;
       int anioNac = p1.getFechaNac().getYear();
       Date fechaActual = new Date();
        int anioActual = fechaActual.getYear();
        edad = anioActual-anioNac;
        System.out.println("La edad de " +  p1.getNombre() + " es " + edad + " años.");
        return edad;
    }
public boolean menorQue(int edad,int edad2){
     boolean retorno;
    if (edad<edad2){
        retorno=true;
    }else { retorno=false;
    
    }return retorno;
   
    
}
public void mostrarPersona(){
    System.out.println("");
}
}

