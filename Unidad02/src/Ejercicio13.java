
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio13 {
public static void main(String[] args) {
        /* Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente */

        int hora, minutos, segundos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        minutos = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        segundos = sc.nextInt();

        if (segundos < 59) {
            segundos++;
        } else {
            segundos = 0;
            if (minutos < 59) {
                minutos++;
            } else {
                minutos = 0;
                if (hora < 23) {
                    hora++;
                } else {
                    hora = 0;
                }
            }
        }

        System.out.println("La hora siguiente es: " + hora + ":" + minutos + ":" + segundos);
        sc.close();

    }
    
}
