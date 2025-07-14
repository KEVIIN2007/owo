package Ejercicios5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
         Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(101); // entre 0 y 100 inclusive
        int intentosMaximos = 5;
        boolean acertado = false;

        System.out.println("¡Adivina el número que estoy pensando (entre 0 y 100)!");
        System.out.println("Tienes " + intentosMaximos + " intentos.");

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("Intento " + intento + ": ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                acertado = true;
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            int oportunidadesRestantes = intentosMaximos - intento;
            if (oportunidadesRestantes > 0) {
                System.out.println("Te quedan " + oportunidadesRestantes + " intento(s).\n");
            }
        }

        if (!acertado) {
            System.out.println("\nLo siento, se te acabaron los intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
    
}
