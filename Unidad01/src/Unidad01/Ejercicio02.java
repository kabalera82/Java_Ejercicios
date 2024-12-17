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
public class Ejercicio02 {
    //Pide un numero y muestralo por consola.

    public static void main(String[] args) {
        //Pide un numero y muestralo por consola.

        int num;
        System.out.println("Dame un numero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Tu número es: " + num);
        sc.close();
    }
}
