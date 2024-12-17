/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01;

import java.util.Scanner;

/**
 *
 * @author kabalera
 */
public class Actividades_Clase_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese valores para diferentes tipos de datos enteros (byte, short, int, y long)
        System.out.println("Introduce un número entero para byte:");
        byte numeroByte = sc.nextByte();
        System.out.println("Introduce un número entero para short:");
        short numeroShort = sc.nextShort();
        System.out.println("Introduce un número entero para int:");
        int numeroInt = sc.nextInt();
        System.out.println("Introduce un número entero para long:");
        long numeroLong = sc.nextLong();

        System.out.println("Valor como byte: " + numeroByte);
        System.out.println("Valor como short: " + numeroShort);
        System.out.println("Valor como int: " + numeroInt);
        System.out.println("Valor como long: " + numeroLong);

        // Solicitar al usuario que ingrese dos números decimales y determinar cuál de ellos es mayor o si son iguales
        System.out.println("Introduce el primer número decimal:");
        double decimal1 = sc.nextDouble();
        System.out.println("Introduce el segundo número decimal:");
        double decimal2 = sc.nextDouble();

        System.out.println(decimal1 + " es mayor que " + decimal2 + ": " + (decimal1 > decimal2));
        System.out.println(decimal2 + " es mayor que " + decimal1 + ": " + (decimal2 > decimal1));
        System.out.println(decimal1 + " y " + decimal2 + " son iguales: " + (decimal1 == decimal2));

        // Comparar dos números enteros para verificar si el primero es mayor que el segundo utilizando una condición booleana
        System.out.println("Introduce un número entero para comparar:");
        int numeroA = sc.nextInt();
        System.out.println("Introduce otro número entero para comparar:");
        int numeroB = sc.nextInt();

        boolean esMayor = numeroA > numeroB;
        System.out.println("¿El primer número es mayor que el segundo? " + esMayor);

        // Mostrar el valor de una constante predefinida en el programa
        final double PI = 3.141592653589793;
        System.out.println("El valor de la constante PI es: " + PI);

        // Solicitar una nota al usuario y clasificarla en una categoría usando una estructura if-else
        System.out.println("Introduce una nota (0-10):");
        int nota = sc.nextInt();
        String[] clasificaciones = {"Insuficiente", "Insuficiente", "Insuficiente", "Insuficiente", "Insuficiente", "Suficiente", "Bien", "Notable", "Notable", "Sobresaliente", "Sobresaliente"};
        String clasificacion = clasificaciones[nota];
        System.out.println("Clasificación: " + clasificacion);

        // Solicitar al usuario que ingrese un número de día (entre 1 y 7) y mostrar el nombre del día correspondiente utilizando una estructura switch
        System.out.println("Introduce un número del 1 al 7 para el día de la semana:");
        int diaSemana = sc.nextInt();
        String[] dias = {"Número inválido", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String dia = (diaSemana >= 1 && diaSemana <= 7) ? dias[diaSemana] : dias[0];
        System.out.println("Día de la semana: " + dia);

        sc.close();
    }
}
