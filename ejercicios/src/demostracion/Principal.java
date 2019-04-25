/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author FJTAMATTSH
 */
public class Principal {
    public static void main (String[]args){
            
   Scanner entrada = new Scanner(System.in);
   System.out.println("CALCULO DE COSTO DE ENVIO DE MENSAJES");
   System.out.println("Ingrese la cantidad de mensajes que ha enviado en el mes:");
   int mensajes = entrada.nextInt();
   double valor;
    //Si son 40 mensajes por mes les cobra $3 dolare smensuales 
   if (mensajes <= 40){
       valor = mensajes*3;     
   }else{
    //Si es mayor a 40 mensjaes cobra 5ctvs adicional por cada mensaje del 40 al 200
       if(mensajes > 40 && mensajes <= 200){
            valor = mensajes*3.05;
    //se cobra 10 ctvs adicionales por cadamensaje si s epasa de los 200
       }else{
           valor = mensajes*3.10;
       }
   }
   // calcular el iva 12%
   double  iva = valor *0.12;
   valor = valor + iva ;
   System.out.printf("Usted ha enviado %d por tanto el costo de su tarifa"
           + " es de %.2f$  ", mensajes, valor);
    
      
  }
}
