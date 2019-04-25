/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion;


/**
 *
 * @author FJTAMATTSH
 */
public class SeleccionDoble {
public static void main(String[]args){
    
       String miMensaje = Operacion.mensaje;
       String miMensaje2 = Operacion.mensaje2;
       
       // importar  el Scanner que permita la entrada de Datos
       Scanner entrada = new Scanner(System.in);
       
       //Entrada de Datos de la primera calificacion 
       System.out.println("Ingrese su calificacion 1 : ");
       int calificacion = entrada.nextInt();
       
       //Uso del condicional doble If Else determinacion de aprobado o reprobado
       if (calificacion >=85){
           System.out.printf("%s %d\n", miMensaje, calificacion);
       }else{
        System.out.printf("%s %d\n\n",miMensaje2, calificacion);
       }
       
        //Entrada de datos de la segunda calificacion
       System.out.println("Ingrese su calificacion 2 : ");
       int calificacion_2 = entrada.nextInt(); 
       
       //Uso del condicional Doble If Else
       if (calificacion_2 >= 85){
           System.out.printf("%s %d\n", miMensaje, calificacion_2 );
       }else{
           System.out.printf("%s %d\n", miMensaje2, calificacion_2 );
       }
   }
    
}

 

