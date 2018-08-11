package javaapplication26;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cantpar = 0;
        int cantimpar = 0;
        
        System.out.println("Ingrese diez numeros:");
        System.out.println();
        
        for (int i = 0; i < 10; i++) {
            System.out.print(" .  ");
            num = scan.nextInt();
            
            if (num % 2 == 0) 
                cantpar++;
            else
                cantimpar++;            
        }
        System.out.println();
        System.out.println("Cantidad de numeros pares: " + cantpar);
        System.out.println("Cantidad de numeros impares: " + cantimpar);
        
        
        
    }
    
}
