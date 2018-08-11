package javaapplication26;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.print("Ingrese un numero: ");
        num = scan.nextInt();

        if (num < 0) {
            System.out.println("El numero es negativo.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        System.out.println();
        System.out.println("Factorial: " + fact);
    }

}
