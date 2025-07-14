package Ejercicios5;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
         Random random = new Random();
        int dado1, dado2;
        int tiradas = 0;

        System.out.println("Tirando los dados hasta que salgan iguales...\n");

        do {
            dado1 = random.nextInt(6) + 1; // 1 a 6
            dado2 = random.nextInt(6) + 1; // 1 a 6
            tiradas++;
            System.out.println("Tirada " + tiradas + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
        } while (dado1 != dado2);

        System.out.println("\n¡Doble conseguido! Ambos dados muestran " + dado1);
        System.out.println("Total de tiradas: " + tiradas);
    }
}
