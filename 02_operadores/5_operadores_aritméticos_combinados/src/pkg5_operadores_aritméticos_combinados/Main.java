/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_operadores_aritméticos_combinados;

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
        
        int num1 = 10;
        int num2 = 5;
        
        // forma normal
                
                num1 = num1 + num2;
        System.out.println(num1);
        
        
        num1 = 10;
        num1 += num2;
        System.out.println(num1);
        
        // resta
        
        num1 = 10; //hay que resetear o volver a declarar el valor
        
        num1-=num2;
        System.out.println(num1);
        
        //multiplicación
        
        num1 = 10;
        
        num1 *=num2;
        System.out.println(num1);
        
        //División
        num1=10;
        num1/=num2;
        System.out.println(num1);
        
        //Resto
        num1=10;
        num1%=num2;
        System.out.println(num1);
    }
    
}
