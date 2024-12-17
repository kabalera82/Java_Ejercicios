/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01;

import java.util.Scanner;

/**
 *
 * @author kabalera
 */
public class Ejercicio15 {
    /*
    * Un economista te ha encargado un programa para realizar cálculos con el IVA.
    * La aplica-ción debe solicitar la base imponible y el IVA que se debe aplicar.
    * Muestra en pantalla el importe correspondiente al IVA y al total.
    */
    public static void main(String[] args) {
        // Declaración de variablesS
        double importe;
        int iva;
        double precioTotal;
        double importeIVA;

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca el importe
        System.out.println("Introduce el importe: ");
        importe = sc.nextDouble();

        // Solicitar al usuario que introduzca el IVA
        System.out.println("Introduce el IVA (en porcentaje, por ejemplo, 21 para 21%): ");
        iva = sc.nextInt();

        // Calcular el importe del IVA
        importeIVA = importe * iva / 100;

        // Calcular el precio total
        precioTotal = importe + importeIVA;

        // Mostrar los resultados
        System.out.println("El importe introducido es: " + importe);
        System.out.println("El importe del IVA es: " + importeIVA);
        System.out.println("El precio total es: " + precioTotal);
        sc.close();
    }
}