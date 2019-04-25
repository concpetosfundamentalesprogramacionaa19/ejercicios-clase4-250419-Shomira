/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacionesdos;

/**
 *
 * @author FJTAMATTSH
 */
public class SeleccionAnidada {
    public static void main(String[]args){
    //Ingreso de la calificacion 
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese su calificación ");
    int calificacion = entrada.nextInt() ;
    
    //Analisis de las calificaciones
    //Importacion d elas clases
    if (calificacion >= 90 ){
        System.out.printf("%s %d\n", Operacionesdos.mensaje1 ,calificacion);
    }else{
        if(calificacion < 90 && calificacion >=80){
            System.out.printf("%s (Muy Buena)%d\n", 
                    Operacionesdos.mensaje2, calificacion);
        }else{
            if(calificacion < 80 && calificacion >= 50 ){
            System.out.printf("%s (Regular) %d\n",
                    Operacionesdos.mensaje3 ,calificacion);
            }else{
                System.out.printf("%s %d\n",  
                    Operacionesdos.mensaje4 ,calificacion);
            }
        }
    }
    }
    
}
