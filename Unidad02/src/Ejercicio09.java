
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        /* Pedir dos números y mostrarlos ordenadamente en forma decreciente */

        /* Indica cuantas cifras tiene un número entre 0 y 999999 */

        /*
         * if (args.length != 1) {
         * System.out.println("Debes introducir un número como argumento.");
         * System.exit(1);
         * }
         */
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        if (num < 10) {
            System.out.println("El número tiene 1 cifra.");
        } else if (num < 100) {
            System.out.println("El número tiene 2 cifras.");
        } else if (num < 1000) {
            System.out.println("El número tiene 3 cifras.");
        } else if (num < 10000) {
            System.out.println("El número tiene 4 cifras.");
        } else if (num < 100000) {
            System.out.println("El número tiene 5 cifras.");
        } else if (num < 1000000) {
            System.out.println("El número tiene 6 cifras.");
        }
        sc.close();

    }
}
