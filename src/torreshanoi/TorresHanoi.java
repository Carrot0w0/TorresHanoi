/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package torreshanoi;

import java.util.*;

public class TorresHanoi {

    public static void main(String[] args) {
        Scanner WB=new Scanner(System.in);
        Hanoi FB=new Hanoi();
        int ficha,torre;
        System.out.println("JUEGO TORRES DE HANOI\n El juego consiste en llevar TODAS las fichas de la torre 1 a la torre 3\n REGLAS DEL JUEGO \n 1_Puedes mover una ficha a la vez\n 2_No puedes poner una ficha grande arriba de una pequeña\n 3_Los cero son lugares vacios\n 4_Solo puede hacer 7 movimientos \n Si intenta hacer un movimiento no permitido, un de mensaje de aviso aparecera");
while(FB.Ganar==false)
{
    
    for(int i=2;i>=0;i--){
  
    System.out.println("\t"+FB.torre1[i]+"\t"+FB.torre2[i]+"\t"+FB.torre3[i]);
}
    
    System.out.println("     =====    =====   ==== ");
    System.out.println("       1        2        3 ");
    System.out.println("QUE FICHA DESEA MOVER");
    ficha=WB.nextInt();
    
    
    System.out.println("ELIGE LA TORRE A DONDE LA QUIERES MOVER");
    torre=WB.nextInt();
    
     if(FB.Condificha(ficha)==false){
         }else
        System.out.println("Esa ficha no se puede mover NECIOOOO!!!"); 
         
   if(FB.Conditorre(torre,ficha)==true){
        FB.Mover(ficha,torre); 
         // FB.Condificha(ficha);
         
    }else
        System.out.println("No se puede mover ahi NECIOOOO!!!");
    
    FB.Ganar();
    }

System.out.print("-----------------USTED HA GANAOOOOOOOOO!!!---------------------");
     
   
    
    
  // FB.Mover(ficha,torre);
 
  // FB.Conditorre(torre, ficha);
   
   
 /* if (FB.Ganar == true)
      
   {
for(int i=2;i>=0;i--){
  
    System.out.println("\t"+FB.torre1[i]+"\t"+FB.torre2[i]+"\t"+FB.torre3[i]);
        
}
System.out.println("     =====    =====   ==== ");
    System.out.println("       1        2        3 ");
    System.out.println("--------HA GANADO-------");
 }
  }
  */  
    
  }
}

    
  


    

