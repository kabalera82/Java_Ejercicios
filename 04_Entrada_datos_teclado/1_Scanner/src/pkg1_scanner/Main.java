/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_scanner;

import java.util.Scanner;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaración de vbariables

        Scanner lector = new Scanner(System.in);

        /*
        leemos por teclado un String
        System.out.println("Introduce un color: ");
        String color = lector.nextLine();
        System.out.println("El color es: " + color);
         */
        /*
        leemos un numero por teclado
        System.out.println("Introduce un numero: ");
        int numero = lector.nextInt();
        System.out.println("El numero introducido es: " + numero);
        */
        
        // leemos un numero por teclado pero hacemos la conversion
        System.out.println("Introduce un numero: ");
        String numeroTexto = lector.nextLine();
        int numero = Integer.parseInt(numeroTexto);
        System.out.println("El numero introducido es : " + numero);

    }

}
