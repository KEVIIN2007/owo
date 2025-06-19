package Ejercicios4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        
        System.out.println("=== MINICUESTIONARIO ===");
        System.out.println("Responde con 'a', 'b', 'c' o 'd'");
        
        // Pregunta 1
        System.out.println("\n1. ¿Cuál es la capital de Francia?");
        System.out.println("a) Londres  b) París  c) Madrid  d) Roma");
        String respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        // Pregunta 2
        System.out.println("\n2. ¿Cuántos planetas hay en el sistema solar?");
        System.out.println("a) 7  b) 8  c) 9  d) 10");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        // Pregunta 3
        System.out.println("\n3. ¿Quién escribió 'Don Quijote'?");
        System.out.println("a) Shakespeare  b) Cervantes  c) Lorca  d) Neruda");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        // Pregunta 4
        System.out.println("\n4. ¿Cuál es el océano más grande?");
        System.out.println("a) Atlántico  b) Índico  c) Pacífico  d) Ártico");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("c")) puntos++;
        
        // Pregunta 5
        System.out.println("\n5. ¿En qué año llegó el hombre a la Luna?");
        System.out.println("a) 1967  b) 1969  c) 1971  d) 1973");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        // Pregunta 6
        System.out.println("\n6. ¿Cuál es el elemento químico del oro?");
        System.out.println("a) Au  b) Ag  c) Cu  d) Fe");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("a")) puntos++;
        
        // Pregunta 7
        System.out.println("\n7. ¿Cuántos continentes hay?");
        System.out.println("a) 5  b) 6  c) 7  d) 8");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("c")) puntos++;
        
        // Pregunta 8
        System.out.println("\n8. ¿Qué gas respiramos principalmente?");
        System.out.println("a) Oxígeno  b) Nitrógeno  c) CO2  d) Hidrógeno");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        // Pregunta 9
        System.out.println("\n9. ¿Cuál es la montaña más alta del mundo?");
        System.out.println("a) K2  b) Everest  c) Aconcagua  d) Kilimanjaro");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        // Pregunta 10
        System.out.println("\n10. ¿Cuántos lados tiene un hexágono?");
        System.out.println("a) 5  b) 6  c) 7  d) 8");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) puntos++;
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Puntuación obtenida: " + puntos + "/10");
        
        if (puntos >= 8) {
            System.out.println("¡Excelente! Tienes muy buenos conocimientos.");
        } else if (puntos >= 6) {
            System.out.println("Bien, tienes conocimientos aceptables.");
        } else if (puntos >= 4) {
            System.out.println("Regular, deberías estudiar más.");
        } else {
            System.out.println("Insuficiente, necesitas repasar mucho más.");
        }
    }
    }
    

