
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        /* Pedir dos números y mostrarlos ordenadamente en forma decreciente */

        int num1, num2, Mayor, Menor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        num2 = sc.nextInt();

        Mayor = num1 > num2 ? num1 : num2; // Operador ternario para asignar a la variable Mayor el valor del número mayor
        Menor = num1 < num2 ? num1 : num2; // Operador ternario para asignar a la variable Menor el valor del número menor
        System.out.println(Mayor + ", " + Menor);
        sc.close();
    }
    
}