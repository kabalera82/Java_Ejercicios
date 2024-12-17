
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un ángulo en grados: ");
        int grados = sc.nextInt();

        // Convertir el ángulo al rango de 0° a 360°
        grados = grados % 360;
        if (grados < 0) {
            grados += 360;
        }

        // Convertir grados a radianes
        double radianes = Math.toRadians(grados);

        System.out.println("El ángulo en radianes es: " + radianes);

        sc.close();
    }
}

