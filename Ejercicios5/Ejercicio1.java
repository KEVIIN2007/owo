package Ejercicios5;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};

       
        Random random = new Random();

        
        int indiceValor = random.nextInt(valores.length); 
        int indicePalo = random.nextInt(palos.length);    

      
        String valor = valores[indiceValor];
        String palo = palos[indicePalo];

        System.out.println("La carta seleccionada es: " + valor + " de " + palo);
    }
    
}
