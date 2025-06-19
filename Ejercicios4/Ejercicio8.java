package Ejercicios4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la base imponible: ");
        double baseImponible = scanner.nextDouble();
        
        System.out.print("Introduce el tipo de IMPUESTO (general, reducido o superreducido): ");
        String tipoImpuesto = scanner.next().toLowerCase();
        
        System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromo = scanner.next().toLowerCase();
        
        // Calcular impuesto
        double porcentajeImpuesto = 0;
        switch (tipoImpuesto) {
            case "general":
                porcentajeImpuesto = 0.21;
                break;
            case "reducido":
                porcentajeImpuesto = 0.10;
                break;
            case "superreducido":
                porcentajeImpuesto = 0.04;
                break;
        }
        
        double impuesto = baseImponible * porcentajeImpuesto;
        double precioConImpuesto = baseImponible + impuesto;
        
        // Calcular descuento
        double descuento = 0;
        switch (codigoPromo) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = precioConImpuesto * 0.5;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConImpuesto * 0.05;
                break;
        }
        
        double precioFinal = precioConImpuesto - descuento;
        
        System.out.println("\nBase imponible\t\t" + String.format("%.2f", baseImponible));
        System.out.println("IMPUESTO (" + (int)(porcentajeImpuesto * 100) + "%)\t\t" + String.format("%.2f", impuesto));
        System.out.println("Precio con IMPUESTO\t" + String.format("%.2f", precioConImpuesto));
        System.out.println("Cód. promo. (" + codigoPromo + ")\t-" + String.format("%.2f", descuento));
        System.out.println("TOTAL\t\t\t" + String.format("%.2f", precioFinal));
    }  
    }
    

