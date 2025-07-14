package Ejercicios5;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero;
        int contador = 0;

        System.out.println("Generando números pares entre 0 y 100...");

        do {
            // Generar número par entre 0 y 100
            numero = random.nextInt(51) * 2; // 0*2 = 0, 50*2 = 100
            System.out.print(numero + " ");
            contador++;
        } while (numero != 24);

        System.out.println("\n\nSe han generado " + contador + " número(s) hasta obtener el 24.");
    }
    
}
