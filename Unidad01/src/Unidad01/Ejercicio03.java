package Unidad01;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //Pide al usuario su edad y mostrar por consola la que tenga el año siguiente
        int edad;
        System.out.println("Dame tu edad");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        System.out.println("Tu edad el año que viene si ya has cumplido será: " + edad);
        sc.close();
    }
}
