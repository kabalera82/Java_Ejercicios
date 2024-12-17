/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio17 {

    /*
    * Implementa la aplicación Eco,
    * que pide al usuario un número y muestra en pantalla la sa-lida:
    * Eco...Eco...Eco...Se muestra «Eco...» tantas veces como indique el número introducido.
    * La salida anterior sería para el número 3.    
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int repeticiones = 0;
        boolean esValido = false;

        System.out.println("Introduce un número para repetir 'Eco...':");

        // Validar que la entrada sea un número entero positivo
        while (!esValido) {
            System.out.print("Número: ");
            if (sc.hasNextInt()) {
                repeticiones = sc.nextInt();
                if (repeticiones > 0) {
                    esValido = true;
                } else {
                    System.out.println("Por favor, introduce un número positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número entero.");
                sc.next(); // Limpiar la entrada no válida
            }
        }

        // Bucle for que se ejecuta 'repeticiones' veces
        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Eco...");
        }
        System.out.println(); // Salto de línea al final

        sc.close();
    }
}
