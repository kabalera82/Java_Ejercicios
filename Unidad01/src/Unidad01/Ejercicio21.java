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
public class Ejercicio21 {

    public static void main(String[] args) {
        /*
        * Un biólogo está realizando un estudio de distintas especies de invertebrados y 
        * necesita una aplicación que le ayude a contabilizar el número de patas 
        * que tienen en total todos los animales capturados durante una jornada de trabajo.
        * Para ello, te ha solicitado que escribas una aplicación a la que hay que 
        * proporcionar:  El número de hormigas capturadas (6 patas).  
        * El número de arañas capturadas (8 patas).  
        * El número de cochinillas capturadas (14 patas).
        * La aplicación debe mostrar el número total de patas.
        */
        // Declaración de variables
        int numHormigas, numArañas, numCochinillas;
        int totalPatas;

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca el número de hormigas capturadas
        System.out.println("Introduce el número de hormigas capturadas: ");
        numHormigas = sc.nextInt();

        // Solicitar al usuario que introduzca el número de arañas capturadas
        System.out.println("Introduce el número de arañas capturadas: ");
        numArañas = sc.nextInt();

        // Solicitar al usuario que introduzca el número de cochinillas capturadas
        System.out.println("Introduce el número de cochinillas capturadas: ");
        numCochinillas = sc.nextInt();

        // Calcular el número total de patas
        totalPatas = (numHormigas * 6) + (numArañas * 8) + (numCochinillas * 14);

        // Mostrar el resultado
        System.out.println("El número total de patas es: " + totalPatas);

        // Cerrar el Scanner
        sc.close();
    }
}
