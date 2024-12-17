
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        /* Crea un programa que pida un numero con decimales e indique si es un numero 
        casi cero o no. Para el programa "casi cero" es un numero que esta entre -0.9 y 0.9 */
        double num;
        System.out.println("Introduce un numero con decimales: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        if (num > -0.9 && num < 0.9) {
            System.out.println("El numero " + num + " es casi cero.");
        } else {
            System.out.println("El numero " + num + " no es casi cero.");
        }
        sc.close();
    }
}