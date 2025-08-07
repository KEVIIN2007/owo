package Ejercicios5.Ejercicios8;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        char[][] tablero = new char[FILAS][COLUMNAS];
        boolean[][] revelado = new boolean[FILAS][COLUMNAS];

        int tesoroFila, tesoroCol, minaFila, minaCol;

        Random rand = new Random();

        // Inicializar tablero vacío
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = '.';
            }
        }


        // Colocar tesoro
        tesoroFila = rand.nextInt(FILAS);
        tesoroCol = rand.nextInt(COLUMNAS);

        // Colocar mina, en una posición distinta al tesoro
        do {
            minaFila = rand.nextInt(FILAS);
            minaCol = rand.nextInt(COLUMNAS);
        } while (minaFila == tesoroFila && minaCol == tesoroCol);

        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;

        while (!encontrado) {
            // Mostrar tablero
            System.out.println("Tablero:");
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    if (revelado[i][j]) {
                        System.out.print(" " + tablero[i][j]);
                    } else {
                        System.out.print(" -");
                    }
                }
                System.out.println();
            }


              // Solicitar coordenadas
            System.out.print("Ingresa fila (0-" + (FILAS - 1) + "): ");
            int fila = sc.nextInt();
            System.out.print("Ingresa columna (0-" + (COLUMNAS - 1) + "): ");
            int col = sc.nextInt();

            if (fila < 0 || fila >= FILAS || col < 0 || col >= COLUMNAS) {
                System.out.println("Coordenadas fuera de rango.");
                continue;
            }

            if (revelado[fila][col]) {
                System.out.println("Ya has elegido esta casilla.");
                continue;
            }

            revelado[fila][col] = true;

             // Evaluar la jugada
            if (fila == tesoroFila && col == tesoroCol) {
                tablero[fila][col] = 'X';
                System.out.println("¡Felicidades! ¡Encontraste el TESORO!");
                encontrado = true;
            } else if (fila == minaFila && col == minaCol) {
                tablero[fila][col] = '*';
                System.out.println("¡BOOM! Pisaste una MINA. Has perdido.");
                encontrado = true;
            } else {
                tablero[fila][col] = '0';
                // Verificar si hay mina cerca (una casilla de distancia)
                if (Math.abs(fila - minaFila) <= 1 && Math.abs(col - minaCol) <= 1) {
                    System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                } else {
                    System.out.println("No hay nada aquí.");
                }
            }
        }


        // Mostrar tablero final
        System.out.println("\nTablero final:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i == tesoroFila && j == tesoroCol) {
                    System.out.print(" X");
                } else if (i == minaFila && j == minaCol) {
                    System.out.print(" *");
                } else if (revelado[i][j]) {
                    System.out.print(" " + tablero[i][j]);
                } else {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
    }
}
    
