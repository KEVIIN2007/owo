package Ejercicios5.Ejercicios8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        Set<Integer> usados = new HashSet<>();
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int num;
                do {
                    num = rand.nextInt(1001);
                } while (usados.contains(num));
                usados.add(num);
                array[i][j] = num;
            }
        }

        for (int[] fila : array) {
            for (int n : fila) {
                System.out.printf("%6d", n);
            }
            System.out.println();
        }
    }
}
    
    

