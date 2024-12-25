/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author kabalera
 *
 */
public class Ejercicio19 {

    /**
     * Realiza un programa que convierta un número decimal en su representación
     * binaria. Hay que tener en cuenta que desconocemos cuántas cifras tiene el
     * número que introduce el usuario. Por simplicidad, iremos mostrando el
     * número binario con un dígito por línea.º1
     */
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Introduce un número decimal:");
            String binario = "";
            int numero;

            numero = sc.nextInt();
            if (numero > 0) {
                while (numero > 0) {
                    if (numero % 2 == 0) {
                        binario = " 0 " + binario;
                    } else {
                        binario = " 1 " + binario;
                    }
                    numero = numero/2;
                }System.out.println(binario);
            } else if (numero < 0) {
                numero = numero * -1;
                while (numero > 0) {
                    if (numero % 2 == 0) {
                        binario = " 0 " + binario;
                    } else {
                        binario = " 1 " + binario;
                    }
                    numero = numero/2;
                }System.out.println(" 1 " + binario);
            }else{
                System.out.println(" 0 ");
            }
        
    }       
    
    
}

