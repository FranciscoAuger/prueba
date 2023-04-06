/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.crearpers;

import Entidades.Persona;
import Servicio.ServP;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class CrearPers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ServP sp= new ServP();
        Persona m1=sp.crearP();
        int edad =sp.edad(m1);
        
        System.out.println("Ingrese edad");
        int edad2=sc.nextInt();
       
        if(sp.menorQue(edad, edad2)==true){
            System.out.println("la edad de la persona es menor que la ingresada. "+edad);
        }else {
            System.out.println("la edad de la persona es mayor"+edad);
        }
        
       
        
    }
    
}
