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
public class Ejercicio14 {
        /* 
        * Muestra un programa que pida un número con decimales
        * y muestre por consola el redondeo más próximo
        */
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número con decimales:");
        double numero = sc.nextDouble();
        
        long redondeo = Math.round(numero);
        System.out.println("El redondeo más próximo es: " + redondeo);
        
        sc.close();
    }
}
