package javaapplication26;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        
        System.out.print("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println();
        
        if (num > 0) 
            System.out.println("El numero es positivo.");
        else
            System.out.println("El numero es negativo.");
        
        
        if (num % 2 == 0) 
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar.");
        
        
        System.out.println("Divisores: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(". " + i);
            }
        }
        System.out.println();
    }
    
}
