/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_operadores_unarios;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion de variables
        int resultado = 1;
        System.out.println(resultado);
        
        int resultado2 = +1;
        System.out.println(resultado2);
        
        int resultado3 = -1;
        System.out.println(resultado3);
        
        //operadores de incremento
        
        resultado ++;
        System.out.println(resultado);
        resultado2 --;
        System.out.println(resultado2);
        
        resultado = -resultado;
        System.out.println(resultado);
        
        //Operación de negación
        boolean esVerdadero = false;
        System.out.println(esVerdadero);
        System.out.println(!esVerdadero); 
    }
    
}
