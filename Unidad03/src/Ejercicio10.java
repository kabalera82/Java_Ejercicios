/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio10 {
    public static void main (String[]args){
        /*
        diseña un programa que muestre la suma de los 10 primeros números impares.
         */

        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            int impar = (2 * i) - 1;
            suma += impar;
            System.out.println("Número impar: " + impar + ", Suma parcial: " + suma);
        }
        System.out.println("La suma de los 10 primeros números impares es: " + suma);
    }
}
