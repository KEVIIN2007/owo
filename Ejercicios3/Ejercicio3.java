package Ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double euros , peseta;
        System.out.println("ingrese la cantidad de soles a convertir : ");
        euros = teclado.nextDouble();
        peseta = euros /0.000053;
        System.out.println("la cantidad de euros seria de : " + peseta);
    }
    
}
