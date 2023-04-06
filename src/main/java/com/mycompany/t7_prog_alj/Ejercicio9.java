
package com.mycompany.t7_prog_alj;
import java.util.Scanner;

public class Ejercicio9 {
    
       public static void main(String[] args) {
       int opcion,num1,num2,suma=0;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("¿De que forma quieres realizar el ejercicio?");
       System.out.println("1- Hacerlo con un FOR");
       System.out.println("2- Hacerlo con un WHILE");
       System.out.println("3- Hacerlo con un DO WHILE");
       opcion= teclado.nextInt();
       
       System.out.println("¿Desde que número quieres empezar a sumar los"
               + " múltiplos de 5?");
       num1 = teclado.nextInt();
       System.out.println("¿En que número quieres que termine de sumar los "
               + "múltiplos de 5?");
       num2 = teclado.nextInt();
       
       switch (opcion) {
           case 1:
               for (int i=num1;i<=num2;i++) {
                   if (i%5 == 0) {
                       suma = suma + i;
                   }
               }
               break;
           case 2:
               while (num1<=num2) {
                   
                   if (num1%5 == 0) {
                       suma = suma + num1;
                   }
                   num1++;
               }
               break;
           case 3:
               do {
                   if (num1%5 == 0) {
                       suma = suma + num1;
                   }
                   num1++;
               } while (num1<=num2);
               break;
       }
       
       System.out.println("La suma de los multiplos de 5 es: "+suma);
       
       }
}
