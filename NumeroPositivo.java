public class NumeroPositivo {
public static void main(String[] args) {
        int numero;

        System.out.println("Por favor, ingresa un número entero");
        numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("El número ingresado es Positivo");
        } else {
            System.out.println("El número ingresado es Negativo");
        }

        /* Operadores de comparación
        
         * ==   igual
         * !=   distinto 
         * <    menor que
         * >    mayor que
         * <=   menor o igual que
         * >=   mayor o igual que
         */
    }
}