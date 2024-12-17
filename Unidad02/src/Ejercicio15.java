
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kabalera
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        /*
         Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
         La aplicación tendrá que indicar si el número introducido es capicúa.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9999: ");
        String numero = sc.nextLine();

        // Eliminar ceros a la izquierda
        numero = numero.replaceFirst("^0+(?!$)", "");

        if (numero.length() > 4 || !numero.matches("\\d+")) {
            System.out.println("Número no válido");
        } else {
            StringBuilder reverso = new StringBuilder(numero).reverse();
            if (numero.equals(reverso.toString())) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }

        sc.close();
    }
}
