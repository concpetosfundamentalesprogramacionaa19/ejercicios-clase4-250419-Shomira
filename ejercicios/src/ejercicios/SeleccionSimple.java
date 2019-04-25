/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import paquetedos.Operacion ;
import java.util.Scanner;

/**
 *
 * @author FJTAMATTSH
 */
public class SeleccionSimple {
    
   public static void main(String[]args){
       //metodo Principal
       // importacion de la clase almacenada ne la variable 
       String miMensaje = Operacion.mensaje;
       
       // importar  el Scanner que permita la entrada de Datos
       Scanner entrada = new Scanner(System.in);
       //Entrada de Datos de la primera calificacion 
       System.out.println("Ingrese su calificacion 1 : ");
       int calificacion = entrada.nextInt();
       
       if (calificacion >=85){
           System.out.printf("%s %d\n", miMensaje, calificacion);
       }
       
        //Entrada de datos de la segunda calificacion
       System.out.println("Ingrese su calificacion 2 : ");
       int calificacion_2 = entrada.nextInt(); 
       
       if (calificacion_2 >= 85){
           System.out.printf("%s %d\n", miMensaje, calificacion_2 );
           
       }
   }
    
}
