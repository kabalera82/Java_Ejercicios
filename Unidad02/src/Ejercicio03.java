
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        //Pide dos numeros por consola y muestra el mayor.

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los numeros son iguales.");
        }
        sc.close();

    }
}
