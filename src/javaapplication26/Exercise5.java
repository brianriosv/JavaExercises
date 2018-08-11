package javaapplication26;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantnum;
        int num;
        float sum = 0;
        float cont = 0;
        float prom;
        
        System.out.println("Cantidad de numeros positivos a ingresar: ");
        cantnum = scan.nextInt();
        
        System.out.println();
        System.out.println("Ingrese los numeros:");
        
        for (int i = 0; i < cantnum; i++) {
            System.out.print(" .  ");
            num = scan.nextInt();
            
            sum += num;
            cont++;
        }
        prom = sum / cont;
        
        System.out.println();
        System.out.println("La sumatoria es: " + sum);
        System.out.println("El promedio es: " + prom);
    }
    
}
