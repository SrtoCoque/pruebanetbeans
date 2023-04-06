package com.mycompany.t7_prog_alj;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionMenu;
        boolean repetirWhile=false;
        double num1,num2;
        String opcionSwitch;
        
        System.out.println("Escribe la opción que deseas:");
        System.out.println("1- Area del cuadrado");
        System.out.println("2- Area del círculo");
        System.out.println("3- Area del triángulo");
        System.out.println("4- Salir");
        opcionMenu = teclado.nextInt();
        
        /*Como me parecia rebundante hacer el menú de las dos formas,
        *se me ha ocurrido meter estas siguientes líneas para así utilizar
        el if else. De esta forma utilizo las dos funciones que pide el ejercicio
        *Y también practico el switch con un String*/
        
        if (opcionMenu ==1) {
            opcionSwitch = "cuadrado";  
        }    else if (opcionMenu == 2) {
               opcionSwitch = "circulo"; 
        }    else if (opcionMenu == 3) {
               opcionSwitch = "triangulo"; 
        }   else {
                opcionSwitch = "salir";
        }
        
        switch (opcionSwitch) {
            case "cuadrado":
                num1 = Ejercicio1.introducirNumero("Introduce el tamaño de la arista:");
                System.out.println("El area del cuadrado es: "+Ejercicio1.areaCuadrado(num1));
                break;
            case "circulo":
                num1 = Ejercicio1.introducirNumero("Introduce el tamaño de radio:");
                System.out.println("El area del circulo es: "+Ejercicio1.areaCirculo(num1));
                break;
            case "triangulo":
                num1 = Ejercicio1.introducirNumero("Introduce el tamaño de la base:");
                num2 = Ejercicio1.introducirNumero("Introduce el tamaño de la altura:");
                System.out.println("El area del circulo es: "+Ejercicio1.areaTriangulo(num1,num2));
                break;
            case "salir":
                System.out.println("San sacabao!");
                repetirWhile = true;
        }
    }
    
    public static float introducirNumero (String texto) {
        float num;
        Scanner teclado = new Scanner(System.in);
        System.out.println(texto);
        num = teclado.nextFloat();
        
        return num;
    }
    
    public static double areaCuadrado (double arista) {
        double resultado;
        resultado = (arista * arista);
        
        return resultado;
    }
        
    public static double areaCirculo (double radio) {
        double resultado;
        resultado = Math.PI*radio*radio;
        
        return resultado;
    }  
    
    public static double areaTriangulo (double base,double altura) {
        double resultado;
        resultado = (base * altura)/2;
        
        return resultado;
    }
}
