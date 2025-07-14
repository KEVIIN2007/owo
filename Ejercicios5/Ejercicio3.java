package Ejercicios5;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        
         Random random = new Random();

        int cantidad = 50;
        int[] numeros = new int[cantidad];
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(100) + 100; 
            numeros[i] = numero;
            System.out.print(numero + " ");

            
            suma += numero;

          
            if (numero > maximo) maximo = numero;
            if (numero < minimo) minimo = numero;
        }

      
        double media = (double) suma / cantidad;

       
        System.out.println("\n\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.printf("Media: %.2f\n", media);
    }
   
    
}
