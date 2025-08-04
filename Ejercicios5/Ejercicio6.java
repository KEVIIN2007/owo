package Ejercicios5;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
          Random random = new Random();

        // Definimos el número de filas y columnas simuladas
        int filas = 30;
        int columnas = 80;

        while (true) {
            for (int i = 0; i < filas; i++) {
                StringBuilder linea = new StringBuilder();
                for (int j = 0; j < columnas; j++) {
                    int ascii = random.nextInt(95) + 32; // 32 a 126 inclusive
                    char caracter = (char) ascii;
                    linea.append(caracter);
                }
                System.out.println(linea);
            }

            Thread.numero(100); // Esperar 100 ms entre "pantallazos"
            System.out.print("\033[H\033[2J"); // Limpiar pantalla (en terminales ANSI)
            System.out.flush();
    }
   } 
}
