
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio18 {

    /*
    * Implementa un programa que pida al usuario un número positivo y lo muestre guarismo a guarismo.
    * Por ejemplo, para el número 123, debe mostrar primero el 3, a continuación el 2 y por último el 1.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean esValido = false;

        System.out.println("Introduce un número positivo:");

        // Bucle para validar la entrada del usuario
        while (!esValido) {
            System.out.print("Número: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    esValido = true; // Entrada válida, salir del bucle
                } else {
                    System.out.println("Por favor, introduce un número positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número entero.");
                sc.next(); // Limpiar la entrada no válida
            }
        }

        System.out.println("Dígitos de derecha a izquierda:");

        // Bucle para mostrar cada dígito desde el último hasta el primero
        while (numero > 0) {
            int digito = numero % 10; // Obtener el último dígito
            System.out.print(digito);
            numero /= 10; // Eliminar el último dígito
        }

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}