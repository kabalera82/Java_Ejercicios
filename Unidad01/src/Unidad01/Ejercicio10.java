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
public class Ejercicio10 {
  public static void main(String[] args) {
        /*
        Diseña un programa que indique si podemos salir a la calle, tener en cuenta
        si está lloviendo y si hemos terminado nuestras tareas.
         */

        // usar operadores lógicos tras recibir la info.
        boolean llueve, tarea, irCalle;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Llueve? (true/false): ");
        llueve = sc.nextBoolean();
        
        System.out.println("¿Tarea finalizada? (true/false): ");
        tarea = sc.nextBoolean();
        
        irCalle = !llueve && tarea;
        
        System.out.println("¿Puedes ir a la calle?: " + irCalle);
        
        sc.close();
    }
}