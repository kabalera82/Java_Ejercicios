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
public class Ejercicio12 {

    public static void main(String[] args) {
        /* Dado un número, calcula su valor absoluto */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");

        int n = sc.nextInt();
        int valorAbsoluto = n < 0 ? -1 * n : n;
        System.out.println("Valor absoluto de " + n + " es " + valorAbsoluto);

        // Alternativa usando Math.abs
        System.out.println("Dame otro número: ");
        n = sc.nextInt();
        valorAbsoluto = Math.abs(n);
        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);

        sc.close();
    }
}
