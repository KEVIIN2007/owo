package Ejercicios5.Ejercicios8;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
         int[][] array = new int[4][5];
        int[] sumaFila = new int[4];
        int[] sumaColumna = new int[5];
        int sumaTotal = 0;
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = 100 + rand.nextInt(900);
                sumaFila[i] += array[i][j];
                sumaColumna[j] += array[i][j];
                sumaTotal += array[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%6d", array[i][j]);
            }
            System.out.printf(" | %6d\n", sumaFila[i]);
        }

        for (int j = 0; j < 5; j++) {
            System.out.printf("%6d", sumaColumna[j]);
        }
        System.out.printf(" | %6d\n", sumaTotal);
    }
}
    
