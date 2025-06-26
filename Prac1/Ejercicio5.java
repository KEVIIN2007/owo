package Prac1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer numero " + numero1 + " es mayor que el segundo " + numero2 + " .");
        } else if (numero2 > numero1) {
            System.out.println("El segundo numero " + numero2 +" es mayor que el primero  " + numero1 + ".");
        } else {

         System.out.println("Ambos numeros son iguales." );
        }

        scanner.close();
    }
}
