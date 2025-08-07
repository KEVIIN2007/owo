package Ejercicios5.Ejercicios8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la posición del alfil (ej. d5): ");
        String pos = sc.nextLine();

        int col = pos.charAt(0) - 'a';
        int fila = 8 - Character.getNumericValue(pos.charAt(1));

        System.out.println("El alfil puede moverse a:");
        for (int i = -7; i <= 7; i++) {
            if (i == 0) continue;

            int newFila = fila + i;
            int newCol1 = col + i;
            int newCol2 = col - i;

            if (newFila >= 0 && newFila < 8) {
                if (newCol1 >= 0 && newCol1 < 8)
                    System.out.print((char) ('a' + newCol1) + "" + (8 - newFila) + " ");
                if (newCol2 >= 0 && newCol2 < 8)
                    System.out.print((char) ('a' + newCol2) + "" + (8 - newFila) + " ");
            }
        }
        System.out.println();
    }
}
    
    

