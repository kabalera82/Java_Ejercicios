/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kabalera
 *
 */
public class Ejercicio22 {

    /**
     * Realiza un programa que almacene la evaluación de distintas expresiones 
     * relacionales en variables booleanas, 
     * y muestra el valor de dichas variables.
     */
    public static void main(String[] args) {
        boolean esIgual = 100 == 100;
        boolean esMenor = 50 < 100;
        boolean esMayor = 100 > 25;
        boolean esDiferente = 100 != 50;
        boolean FalseEsIgual = 100==99;
        boolean FalseEsMenor = 50 > 100;
        boolean FalseEsMayor = 100 < 25;
        boolean FalseEsDiferente = 10!=10;
        System.out.println(esIgual);
        System.out.println(esMenor);
        System.out.println(esMayor);
        System.out.println(esDiferente);
        System.out.println(FalseEsIgual);
        System.out.println(FalseEsMenor);
        System.out.println(FalseEsMayor);
        System.out.println(FalseEsDiferente);
        
    }

}
