package Ejercicios5.Ejercicios8;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
         int[][] array = new int[6][10];
        Random rand = new Random();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(1001);
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxFila = i;
                    maxCol = j;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }

        System.out.printf("Máximo: %d en [%d][%d]\n", max, maxFila, maxCol);
        System.out.printf("Mínimo: %d en [%d][%d]\n", min, minFila, minCol);
    }
}

    
    

