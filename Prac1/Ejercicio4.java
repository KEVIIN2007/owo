package Prac1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);

       System.out.print("Ingresa el primer numero: ");
       int num1 = scanner.nextInt();

       System.out.print("Ingresa el segundo numero: ");
       int num2 = scanner.nextInt();

       System.out.print("Ingresa el tercer numero: ");
       int num3 = scanner.nextInt();

       int mayor, medio, menor;
       
       if (num1 >= num2 && num1 >= num3) {
        mayor = num1;
        if (num2 >= num3) {
            medio = num2;
            menor = num3;
        } else {
            medio = num3;
            menor = num2;

        }
    } else if (num2 >=num1 && num2 >= num3){
        mayor = num2;
        if (num1 >= num3){
            medio = num1;
            menor = num3;
        } else {
            medio = num3;
            menor = num1;
        } 
    } else {
        mayor =num3;
        if (num1 >= num2){
            medio = num1;
            menor = num2;
        } else {
            medio = num2;
            menor = num1;
    }
    }
    
  System.out.println("Numeros ordenados de mayor a menor: " + mayor + " , " + medio + " , " + menor);

  scanner.close();
  }
    }
