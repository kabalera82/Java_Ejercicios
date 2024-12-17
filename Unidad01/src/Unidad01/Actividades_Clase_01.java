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
public class Actividades_Clase_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese números enteros y mostrar los valores de variables tipo byte, short, int y long
        System.out.println("Introduce un número entero:");
        int numeroEntero = sc.nextInt();
        byte numeroByte = (byte) numeroEntero;
        short numeroShort = (short) numeroEntero;
        long numeroLong = (long) numeroEntero;

        System.out.println("Valor como byte: " + numeroByte);
        System.out.println("Valor como short: " + numeroShort);
        System.out.println("Valor como int: " + numeroEntero);
        System.out.println("Valor como long: " + numeroLong);

        // Solicitar al usuario que ingrese dos números decimales y verificar cuál es mayor o si son iguales
        System.out.println("Introduce el primer número decimal:");
        double decimal1 = sc.nextDouble();
        System.out.println("Introduce el segundo número decimal:");
        double decimal2 = sc.nextDouble();

        System.out.println(decimal1 + " es mayor que " + decimal2 + ": " + (decimal1 > decimal2));
        System.out.println(decimal2 + " es mayor que " + decimal1 + ": " + (decimal2 > decimal1));
        System.out.println(decimal1 + " y " + decimal2 + " son iguales: " + (decimal1 == decimal2));

        // Verificar si un número ingresado por el usuario es mayor que otro usando una condición booleana
        System.out.println("Introduce un número para comparar:");
        int numeroA = sc.nextInt();
        System.out.println("Introduce otro número para comparar:");
        int numeroB = sc.nextInt();

        boolean esMayor = numeroA > numeroB;
        System.out.println("¿El primer número es mayor que el segundo? " + esMayor);

        // Mostrar el valor de una constante predefinida
        final double PI = 3.141592653589793;
        System.out.println("El valor de la constante PI es: " + PI);

        // Pedir una nota al usuario y clasificarla usando un if-else
        System.out.println("Introduce una nota (0-10):");
        int nota = sc.nextInt();
        String[] clasificaciones = {"Suspenso", "Suspenso", "Suspenso", "Suspenso", "Suspenso", "Aprobado", "Aprobado", "Notable", "Notable", "Sobresaliente", "Sobresaliente"};
        String clasificacion = clasificaciones[nota];
        System.out.println("Clasificación: " + clasificacion);

        // Pedir un día de la semana (número) y mostrar el día correspondiente sin switch
        System.out.println("Introduce un número del 1 al 7 para el día de la semana:");
        int diaSemana = sc.nextInt();
        String[] dias = {"Número inválido", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String dia = (diaSemana >= 1 && diaSemana <= 7) ? dias[diaSemana] : dias[0];
        System.out.println("Día de la semana: " + dia);

        sc.close();
    }
}
