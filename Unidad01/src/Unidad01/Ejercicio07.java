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
public class Ejercicio07 {

    public static void main(String[] args) {

        // Calcula la longitud y el área de un círculo dado su radio
        Scanner sc = new Scanner(System.in);
        double area, circle, radio;
        System.out.println("Introduce un radio");
        radio = sc.nextDouble();
        circle = 2 * Math.PI * radio;
        System.out.println("La longitud es " + circle);
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área es de: " + area);
        sc.close();
        
    }
}
