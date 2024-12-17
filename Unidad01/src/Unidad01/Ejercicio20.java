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
public class Ejercicio20 {

    public static void main(String[] args) {
        /*
        * Solicita al usuario tres distancias: 
        * La primera, medida en milímetros.
        * La segunda, medida en centímetros.
        * La última, medida en metros.
        * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
        */
        // Declaración de variables
        double milimetros, centimetros, metros, sumaCentimetros;

        // Abrimos el Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos las distancias
        System.out.println("Introduce la distancia en milímetros: ");
        milimetros = sc.nextDouble();

        System.out.println("Introduce la distancia en centímetros: ");
        centimetros = sc.nextDouble();

        System.out.println("Introduce la distancia en metros: ");
        metros = sc.nextDouble();

        // Convertir todas las distancias a centímetros y sumarlas
        sumaCentimetros = (milimetros / 10) + centimetros + (metros * 100);

        // Mostrar el resultado
        System.out.println("La suma de las tres longitudes en centímetros es: " + sumaCentimetros);

        // Cerrar el Scanner
        sc.close();
    }
}
