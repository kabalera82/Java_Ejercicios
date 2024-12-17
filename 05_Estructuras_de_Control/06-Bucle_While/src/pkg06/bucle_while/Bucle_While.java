/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.bucle_while;

/**
 *
 * @author kabal
 */
public class Bucle_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;

        int numero = 0;

        while (contador <= 10) {
            System.out.println("Contador = :" + contador);
            numero = contador++;
        }
        System.out.println("El numero final: " + numero);
    }

}
