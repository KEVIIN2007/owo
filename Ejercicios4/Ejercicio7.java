package Ejercicios4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        boolean esPar = (numero % 2 == 0);
        boolean esDivisibleEntre5 = (numero % 5 == 0);
        
        if (esPar && esDivisibleEntre5) {
            System.out.println("El número " + numero + " es par Y divisible entre 5");
        } else if (esPar) {
            System.out.println("El número " + numero + " es par pero no divisible entre 5");
        } else if (esDivisibleEntre5) {
            System.out.println("El número " + numero + " es divisible entre 5 pero no es par");
        } else {
            System.out.println("El número " + numero + " no es par ni divisible entre 5");
        }
    }
    }
    

