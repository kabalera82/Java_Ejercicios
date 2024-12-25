/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author kabalera
 *
 */
public class Ejercicio25 {

    /**
     * Escribe una aplicación que pida al usuario dos números enteros y muestre:
     * true, si ambos números son distintos entre sí o alguno de ellos es cero;
     * y false en caso contrario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        boolean resultado = num1 == 0 || num2 == 0 || num1 == num2;
        System.out.println("¿Alguno de los números es cero o ambos son iguales? " + resultado);
        sc.close();

    }

}
