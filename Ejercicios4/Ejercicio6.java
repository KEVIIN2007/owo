package Ejercicios4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Ordenamiento burbuja simple
        int[] numeros = {num1, num2, num3};
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Los números ordenados de menor a mayor son: " + 
                          numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
    }
    

