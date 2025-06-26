package Prac1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese el primer numero: ");
      int num1 = scanner.nextInt();

      System.out.println("Ingrese el segundo numero: ");
      int num2 = scanner.nextInt();

      System.out.println("Ingrese el tercer numero: ");
      int num3 = scanner.nextInt();

      if (num1 == 1 && num2 == 2 && num3 == 3) {
        System.out.println("Acceso permitido");
      } else {
        System.out.println("Acceso denegado");
      }
      
      scanner.close();
    }
}

    

