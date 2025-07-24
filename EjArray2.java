import java.util.Random;

public class EjArray2 {
    public static void main(String[] args) {
         final int TAMANIO = 20;

        int[] numeros = new int[TAMANIO];
        int[] cuadrado = new int[TAMANIO];
        int[] cubo = new int[TAMANIO];

        Random random = new Random();

        
        for (int i = 0; i < TAMANIO; i++) {
            numeros[i] = random.nextInt(101); 
            cuadrado[i] = numeros[i] * numeros[i];
            cubo[i] = numeros[i] * numeros[i] * numeros[i];
        }

        
        System.out.printf("%-10s %-10s %-10s\n", "Número", "Cuadrado", "Cubo");
        System.out.println("---------------------------------------");

        for (int i = 0; i < TAMANIO; i++) {
            System.out.printf("%-10d %-10d %-10d\n", numeros[i], cuadrado[i], cubo[i]);
        }
    }
    
}
