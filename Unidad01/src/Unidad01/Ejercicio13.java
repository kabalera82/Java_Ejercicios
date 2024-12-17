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
public class Ejercicio13 {

    /*
    * Crea un programa que solicite las notas del 1er, segundo y tercer trimestre.
    * El programa mostrará la nota media solo parte entera y otra salida con decimales
     */
    public static void main(String[] args) {

        /* Crea un programa que solicite las notas del 1er, segundo y tercer trimestre.
        * El programa mostrará la nota media solo parte entera y otra salida con decimales
         */
        int nota1, nota2, nota3, boletin;
        double expediente;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer trimestre:");
        nota1 = sc.nextInt();

        System.out.println("Introduce la nota del segundo trimestre:");
        nota2 = sc.nextInt();

        System.out.println("Introduce la nota del tercer trimestre:");
        nota3 = sc.nextInt();

        expediente = (nota1 + nota2 + nota3) / 3.0;
        boletin = (int) expediente; // convertimos el double de expediente en un int

        System.out.println("Nota media (parte entera): " + boletin);
        System.out.println("Nota media (con decimales): " + expediente);

        sc.close();
    }
}
