/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;
/**
 *
 * @author kabalera
 */
public class Calculadora {

   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        double numero, numero2, resultado = 0;
        char operador;
        System.out.println("Introduce el primer número:");
        numero = sc.nextDouble();
        while (true) {
            System.out.println("Introduce el operador (+, -, *, /, =):");
            operador = sc.next().charAt(0);
            
            if (operador == '=') {
                System.out.println("Resultado = " + resultado);
                break;
            }
            
            System.out.println("Introduce el siguiente número:");
            numero2 = sc.nextDouble();
            
            switch (operador) {
                case '+' -> resultado = numero + numero2;
                case '-' -> resultado = numero - numero2;
                case '*' -> resultado = numero * numero2;
                case '/' -> {
                    if (numero2 != 0) {
                        resultado = numero / numero2;
                    } else {
                        System.out.println("Error: División por cero.");
                        continue;
                    }
                }
                default -> {
                    System.out.println("Operador no válido.");
                    continue;
                }
            }
            
            numero = resultado; // Actualiza el número para la siguiente operación
            System.out.println("Resultado intermedio = " + resultado);
        }
    }
   }
}
