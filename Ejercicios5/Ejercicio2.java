package Ejercicios5;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
         Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(11); 
            System.out.print(numero + " ");
        }

        System.out.println(); 
    }
    
}
