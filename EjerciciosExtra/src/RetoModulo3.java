/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class RetoModulo3 {

    /*
    * Solicita al usuario su nombre, edad y promedio de calificaciones.
    * Usa System.out.println para confirmar cada dato ingresado por el usuario en la consola.
    * Realiza un cálculo sencillo usando la edad y el promedio 
    * (por ejemplo, incrementa la edad en 5 años y calcula la mitad del promedio de calificaciones).
    * Solicita un valor boolean para confirmar si el usuario está satisfecho con el resultado de los cálculos.
    * Muestra un mensaje de despedida personalizado en función de si el usuario está satisfecho o no.
     */
    public static void main(String[] args) {

        //activamos el scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Declaración de variables
        String nombre;
        int edad;
        double promedio;

        do {
            // Pedimos que se introduzcan los datos
            System.out.print("Nombre: ");
            nombre = sc.nextLine();

            System.out.print("Edad (introduce 0 para salir): ");
            edad = sc.nextInt();


            System.out.print("Promedio de calificaciones: ");
            promedio = sc.nextDouble();

            // Limpiar el buffer del scanner
            sc.nextLine();

            // Confirmamos cada dato ingresado por el usuario en la consola
            System.out.println("Nombre ingresado: " + nombre);
            System.out.println("Edad ingresada: " + edad);
            System.out.println("Promedio de calificaciones ingresado: " + promedio);

            // Realizamos un cálculo sencillo usando la edad y el promedio
            int edadIncrementada = edad + 5;
            double mitadPromedio = promedio / 2;

            System.out.println("En 5 años tendrás: " + edadIncrementada + " años.");
            System.out.println("La mitad de tu promedio de calificaciones es: " + mitadPromedio);

            // Solicitamos un valor boolean para confirmar si el usuario está satisfecho con el resultado de los cálculos
            System.out.print("¿Estás satisfecho con el resultado de los cálculos? (true/false): ");
            boolean satisfecho = sc.nextBoolean();
            if
            

            // Limpiar el buffer del scanner
            sc.nextLine();

            // Mostramos un mensaje de despedida personalizado en función de si el usuario está satisfecho o no
            if (satisfecho) {
                System.out.println("¡Me alegra saber que estás satisfecho, " + nombre + "! Hasta luego.");
            } else {
                System.out.println("Lamento que no estés satisfecho, " + nombre + ". Hasta luego.");
            }

        } while (edad != 0);

        // Cerramos el escáner
        sc.close();
    }
}
