package Ejercicios5.Ejercicios8;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] num = {
            {0, 30, 2, 0, 0, 5},
            {75, 0, 0, 0, 0, 0},
            {0, 0, -2, 9, 0, 11}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%6d", num[i][j]);
            }
            System.out.println();
        }
    }

    }
    

