/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_joptionpane_optiondialog;

import java.util.Scanner;



/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esto necesita la creación de objetos
    double a, b, c , x1, x2, d;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca primer coeficiente (a): ");
    a = sc.nextDouble();

    System.out.print("Introduzca segundo coeficiente (b): ");
    b = sc.nextDouble();
   
    System.out.print("Introduzca tercer coeficiente (c): ");
    c = sc.nextDouble();

    d =( b* b - 4 * a * c);
    if (d < 0) {
        System.out.println("No existen soluciones reales"); 
        } else {
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado");
        } else { 
            x1 = (-b + Math.sqrt(d))/(2 * a);
            x2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        }
    }
    }
}

