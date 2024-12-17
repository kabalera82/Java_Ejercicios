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
public class Ejercicio19 {
    /*
    *Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
    *La aplicación debe mostrar cuántas horas,
    *minutos y segundos hay en el número de segundos introducidos por el usuario.
    */
    public static void main (String[]args){
        // Declaración de variables
        int segundosTotales, horas, minutos, segundos;

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca una cantidad de segundos
        System.out.println("Introduce una cantidad de segundos: ");
        segundosTotales = sc.nextInt();

        // Calcular las horas, minutos y segundos
        horas = segundosTotales / 3600;
        minutos = (segundosTotales % 3600) / 60;
        segundos = segundosTotales % 60;

        // Mostrar el resultado
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        // Cerrar el Scanner
        sc.close();
    }
}
