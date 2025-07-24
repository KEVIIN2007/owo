import java.util.Scanner;

public class EjArray {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("\nLos números en orden inverso son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
    }
    
