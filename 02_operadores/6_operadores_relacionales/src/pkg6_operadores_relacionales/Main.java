/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_operadores_relacionales;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        int num1 = 4;
        int num2 = 5;
        
        boolean resultado = false;        
        // operador de igualdad o igal que ==
        resultado = num1 == num2;
        System.out.println(resultado);
        
        System.out.println(num1 == num2);
        //operador de desigualdad distinto que !=
        System.out.println(num1 != num2);
        
        //Operador de menor <
        System.out.println(num1 < num2);
        
        //Operador de mayor >
        System.out.println(num1 > num2);
        
        //operador de menor o igual que
        
        System.out.println(num1<=num2);
        
        //operador de mayor o igual que
        
        System.out.println(num1 >=num2);
        
         
    }
    
}
