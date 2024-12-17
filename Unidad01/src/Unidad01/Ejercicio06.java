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
public class Ejercicio06 {

    public static void main(String[] args) {

        // Pide al usuario su edad y muestra por consola la que tendrá el año siguiente
        int edad;
        System.out.println("Dame tu edad");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        System.out.println("Tu edad el próximo año será: " + (edad + 1));

        // Pide al usuario cuatro notas y calcula la media
        int nota1, nota2, nota3, nota4;
        double media;
        System.out.println("Nota1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota2: ");
        nota2 = sc.nextInt();
        System.out.println("Nota3: ");
        nota3 = sc.nextInt();
        System.out.println("Nota4: ");
        nota4 = sc.nextInt();
        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("La nota media es " + media);

        sc.close();
    }
}
