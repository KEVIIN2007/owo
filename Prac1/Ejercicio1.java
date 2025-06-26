package Prac1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);

     System.out.print("Introduce un numero del 1 al 7: ");
     int numero = scanner.nextInt();

     String dia;

     switch (numero) {
        case 1:
        dia = "Lunes";
        break;
        case 2:
        dia = "Martes";
        break;
        case 3:
        dia = "Miercoles";
        break;
        case 4:
        dia = "Jueves";
        break;
        case 5:
        dia = "Viernes";
        break;
        case 6:
        dia = "Sabado";
        break;
        case 7:
        dia = "Domingo";
        break;
        default:
        dia = "Numero invalido. Debe estar entre 1 y 7.";

    }
     
    System.out.println("Dia correspondiente: " + dia);
    scanner.close();
}
}
