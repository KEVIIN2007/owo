package Ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {

 public static void main(String[] args) {
   Scanner Teclado = new Scanner (System.in);
   double soles , euros;
   System.out.println("ingresa la cantidad de soles a convertir");
   soles = Teclado.nextDouble();
   euros = soles / 4.20;
   System.out.println("la cantidad de euros seria de "+ euros);

 }   
    
}
