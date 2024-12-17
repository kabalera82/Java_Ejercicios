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
public class Ejercicio08 {
    public static void main(String[] args) {
        
        /* Realiza una actividad que solicite al usuario su edad
        y le indique si es mayor de edad mediante un boolean
        */
        
        System.out.println("Introduce tu edad: ");
        Scanner sc = new Scanner(System.in);
        
        int edad = sc.nextInt();
        
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoría de edad: " + mayorEdad);
        
        sc.close();
    }
}
