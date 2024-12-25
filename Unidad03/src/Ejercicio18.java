
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

        // Solicitar al usuario que introduzca un número positivo
        System.out.println("Introduce un número positivo: ");
        int numero = sc.nextInt();

        // Verificar que el número sea positivo
        if (numero < 0) {
            System.out.println("El número no es positivo.");
        } else {
            // Mostrar los dígitos del número en orden inverso
            System.out.println("Los dígitos del número en orden inverso son:");
            while (numero > 0) {
                // Obtener el último dígito del número el resto serán los número siguientes
                int digito = numero % 10;
                // Mostrar el dígito
                System.out.print(digito + "  ");
                // Eliminar el último dígito del número
                numero = numero / 10;
            }
        }

        sc.close();
    }
}
