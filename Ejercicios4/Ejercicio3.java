package Ejercicios4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media es: " + media);
        
        String calificacion;
        if (media < 5) {
            calificacion = "insuficiente";
        } else if (media < 7) {
            calificacion = "suficiente";
        } else if (media < 9) {
            calificacion = "bien";
        } else if (media < 10) {
            calificacion = "notable";
        } else {
            calificacion = "sobresaliente";
        }
        
        System.out.println("Nota del boletín: " + calificacion);
    }
    }
    

