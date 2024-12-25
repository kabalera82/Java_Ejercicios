/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author kabalera
 */
public class Ejercicio23 {
    /*
    * Solicita por teclado un número de tipo int al usuario y 
    * escribe un programa que muestre true o false, 
    * dependiendo de si el número es positivo.
    */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número entero:");
        int numero = sc.nextInt();
        boolean esPositivo = numero > 0;
        boolean esNegativo = numero < 0;
        
        System.out.println(esPositivo);
        System.out.println(esNegativo);
        sc.close();
        
        
        
    }

}
