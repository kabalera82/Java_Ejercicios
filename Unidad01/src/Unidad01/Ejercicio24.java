/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01;

/**
 *
 * @author kabalera
 */
public class Ejercicio24 {

    /*
    * Pide dos números al usuario: a y b. 
    * Deberá mostrarse true si ambos números son iguales 
    * y false en caso contrario.
     */
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Solicitar al usuario que introduzca el primer número
        System.out.println("Introduce el primer número (a): ");
        double a = sc.nextDouble();

        // Solicitar al usuario que introduzca el segundo número
        System.out.println("Introduce el segundo número (b): ");
        double b = sc.nextDouble();

        // Comparar los dos números y mostrar el resultado2
        
        boolean sonIguales = (a == b);
        System.out.println(sonIguales);

        // Cerrar el Scanner
        sc.close();
    }
}
