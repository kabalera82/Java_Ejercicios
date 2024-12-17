/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01;

/**
 *
 * @author kabalera
 */
public class Ejercicio25 {
    /*
    * La FILA (Federación Internacional de Lanzamiento de Algoritmo) 
    * realiza una competición donde cada participante escribe un algoritmo 
    * en un papel y lo lanza, ganando quien consiga lanzarlo más lejos.
    * La peculiaridad del concurso es que la longitud del lanzamiento 
    * se mide en metros (con tantos decimales como se desee),
    * pero para el ranking solo se tiene en cuenta la longitud en centímetros
    * (sin decimales). Por ejemplo, para un lanza-miento de 12,3456 m 
    * (que son 1234,56 cm) solo se contabilizarán 1234 cm.
    * Realiza un programa que solicite la longitud (en metros) de un 
    * lanzamiento y muestre la parte entera correspondiente en centímetros.
    */
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Solicitar al usuario que introduzca la longitud del lanzamiento en metros
        System.out.println("Introduce la longitud del lanzamiento en metros: ");
        double longitudMetros = sc.nextDouble();

        // Convertir la longitud a centímetros y tomar la parte entera
        int longitudCentimetros = (int) (longitudMetros * 100);

        // Mostrar el resultado
        System.out.println("La parte entera de la longitud en centímetros es: " + longitudCentimetros);

        // Cerrar el Scanner
        sc.close();
    }
}
