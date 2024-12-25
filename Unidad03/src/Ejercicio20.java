
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kabalera
 *
 */
public class Ejercicio20 {

    /**
     * Genera una aplicación para que el usuario pueda introducir 
     * un número en binario y el programa muestre su conversión a decimal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número binario
        System.out.println("Introduce un número binario: ");
        String binario = sc.nextLine();

        // Convertir el número binario a decimal
        int decimal = Integer.parseInt(binario, 2);

        // Mostrar el número decimal
        System.out.println("El número decimal es: " + decimal);

        // Cerrar el escáner
        sc.close();
    }
}
