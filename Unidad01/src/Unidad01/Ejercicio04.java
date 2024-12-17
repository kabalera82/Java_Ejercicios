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
public class Ejercicio04 {

    public static void main(String[] args) {

        /*Escribe una aplicación que pida el año actual y el de nacimiento del usuario.
       calcula su edad si el año en curso ya ha cumplido años*/
        int aActual;
        int aNacimiento;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Año de nacimiento:");
        aNacimiento = sc.nextInt();
        System.out.println("Año actual:");
        aActual = sc.nextInt();
        edad = aActual - aNacimiento;
        System.out.println("Tu edad es: " + edad);

    }
}

