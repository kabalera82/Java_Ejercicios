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
public class Ejercicio18 {

    /*
    *Dado el siguiente polinomio de segundo grado:y = ax2 + bx + c
    * crea un programa que pida los coeficientes a, b y c, 
    * así como el valor de x, y calcula el valor correspondiente de y.
     */

    public static void main(String[] args) {
        // declaramos las varialers
        double a, b, c, x, y;
        //abrimos el Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a");
        a = sc.nextDouble();
        System.out.println("Introduce el valor de b");
        b = sc.nextDouble();
        System.out.println("Introduce el valor de c");
        c = sc.nextDouble();
        System.out.println("Introduce el valor de x");
        x = sc.nextDouble();

        //calculamos y
        y = a * x * 2 + b * x + c;

        //calculamos "y" y lo sacamos por consola
        System.out.println("El valor de y es: " + y);

    }

}
