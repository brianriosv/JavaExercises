package javaapplication26;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        // A travez de la Clase Scanner podemos leer el numero, 
        // (no olvidar de importar la libreria de Scanner)

        Scanner scanner = new Scanner(System.in);
        int num;
        char iter = 's';
        int cont;

        while (iter == 's') {
            cont = 0;
            System.out.println("Ingrese un numero: ");
            num = scanner.nextInt();

            if (num >= 2) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        cont++;
                    }
                }
                if (cont == 2) {
                    System.out.print("El numero es primo. ");
                } else {
                    System.out.print("El numero no es primo. ");
                }

                System.out.println("¿Desea continuar (S/N)?");
                iter = scanner.next().charAt(0); // De esta manera podemos leer un caracter, agregandole el charAt(0)
            } else {
                System.out.println("NOTA: el número debe ser mayor o igual a dos.");
            }
            System.out.println();
        }
    }
    /*public void IngreseNum(int n, Scanner s){
        n = s.nextInt();
    }*/
}
