
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pedir un numero y decir si es par o impar*/

        int num;
        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");
        } else {
            System.out.println("El numero " + num + " es impar.");
        }
        sc.close();
    }

}
