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
public class Ejercicio09 {

    /* Escribe un programa que pida al usuario e indique mediante
    un literal boolean si es par o impar.
     */
    public static void main(String[] args) {
        int numero;
        System.out.println("Escribe un número: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        boolean esPar = (numero % 2 == 0);
        System.out.println("¿Es par?: " + esPar);

        sc.close();
    }
}

