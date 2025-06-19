package Ejercicios4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ahora introduce el valor de b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones");
            } else {
                System.out.println("Esa ecuación no tiene solución real.");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
    }
