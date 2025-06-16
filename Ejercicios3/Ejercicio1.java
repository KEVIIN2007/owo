package Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 2 numeros (con decimales) separados por un espacio");

        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        

        double promedio = (num1 * num2);
        System.out.println("El promedio de esos 2 numeros es: "+promedio);
    }
}
