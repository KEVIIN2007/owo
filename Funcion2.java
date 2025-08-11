import Biblioteca.Matematicas;



public class Funcion2 {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Programa que suma dos numeros enteros");
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println("la suma es: " + Matematicas.miSuma(num1, num2));
    }
    
 }
    