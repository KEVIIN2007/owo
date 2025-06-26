package Prac1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Por favor, ingresa tu edad: ");
  int edad = scanner.nextInt();

  if (edad > 30) {
    System.out.println("Nunca es tarde para aprender. ¿Que curso tomaremos?");
    } else if (edad >= 18 && edad <= 29) {
        System.out.println("Es un momento excelente para impulsar tu carrera. ");
    } else {    
    System.out.println("¿Sabes hacia donde dirigir tu futuro? Seguro puedo ayudarte.");
    }
     scanner.close();
}
}