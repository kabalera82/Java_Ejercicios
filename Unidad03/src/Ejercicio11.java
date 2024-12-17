
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio11 {
    public static void main(String[]args){
        /*
        Diseña un programa que pida un número y calcule su factorial.
        nota: el factorial de un número es el resultado de multiplicar ese número
         por todos los números enteros positivos menores que él.
         */
        Scanner sc = new Scanner(System.in);
        double factorial; int num;
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        factorial=1;
        for(int i =num;i>0;i--){
            factorial =factorial*i;
        }
        System.out.println("El factorial "+num+"es:"+factorial);

    }
}
