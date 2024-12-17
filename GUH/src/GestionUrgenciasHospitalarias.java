
import java.util.UTF
-8;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author kabalera
 *
 */
public class GestionUrgenciasHospitalarias {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUSS, Sintoma, Exploracion;

        // Bucle para el NUSS
        do {
            System.out.println("Introduce tu NUSS (debe estar entre 100000 y 999999): ");

            // Verificar si la entrada es un número entero
            while (!sc.hasNextInt()) {
                System.out.println("El NUSS introducido no es un número. Vuelva a introducirlo.");
                sc.next(); // Limpiar la entrada no válida
            }

            NUSS = sc.nextInt(); // Asignamos entrada a NUSS

            // Verificar si el NUSS está fuera del rango válido
            if (NUSS < 100000 || NUSS > 999999) {
                System.out.println("El NUSS introducido es incorrecto. Vuelva a introducirlo.");
            }
        } while (NUSS < 100000 || NUSS > 999999); // La condición debe ser || para verificar si está fuera del rango

        boolean validInput;
        do {
            validInput = true; // Asumimos que la entrada es válida hasta que se demuestre lo contrario

            // Bucle para los síntomas
            System.out.println("Que Sintomas Tiene:\n"
                    + "0: Dolor.\n"
                    + "1: Lesión Traumática.\n"
                    + "2: Fiebre Alta.\n"
                    + "3: Confusión o desorientación.");

            while (!sc.hasNextInt()) {
                System.out.println("El síntoma introducido no es un número. Vuelva a introducirlo.");
                sc.next(); // Limpiar la entrada no válida
            }

            Sintoma = sc.nextInt();

            switch (Sintoma) {
                case 0:
                    System.out.println("¿Dolor a que tipo de exploración?:\n"
                            + "0: Dolor Toracico.\n"
                            + "1: Dolor Abdominal.\n"
                            + "2: Dolor de cabeza.\n"
                            + "3: Migraña.");

                    while (!sc.hasNextInt()) {
                        System.out.println("El síntoma introducido no es un síntoma correcto. Vuelva a introducirlo.");
                        sc.next(); // Limpiar la entrada no válida
                    }
                    Exploracion = sc.nextInt();
                    switch (Exploracion) {
                        case 0:
                            System.out.println("Dolor Toracico");
                            break;
                        case 1:
                            System.out.println("Dolor Abdominal.");
                            break;
                        case 2:
                            System.out.println("Dolor de cabeza.");
                            break;
                        case 3:
                            System.out.println("Migraña.");
                            break;
                        default:
                            System.out.println("Síntoma no reconocido");
                            validInput = false; // La entrada no es válida, volver al inicio
                            break;
                    }
                    break; // Añadir break para salir del caso 0

                case 1:
                    System.out.println("¿Resultado de la Exploración?:\n"
                            + "0: Fractura Osea.\n"
                            + "1: Herida de bala.\n"
                            + "2: Quemadura.\n"
                            + "3: Lesión Cerebral Traumática.");

                    while (!sc.hasNextInt()) {
                        System.out.println("El resultado de la Exploración no es un resultado correcto. Vuelva a introducirlo.");
                        sc.next(); // Limpiar la entrada no válida
                    }
                    Exploracion = sc.nextInt();
                    switch (Exploracion) {
                        case 0:
                            System.out.println("Fractura Osea");
                            break;
                        case 1:
                            System.out.println("Herida de bala");
                            break;
                        case 2:
                            System.out.println("Quemadura");
                            break;
                        case 3:
                            System.out.println("Lesión Cerebral Traumática");
                            break;
                        default:
                            System.out.println("Exploración sin resultado");
                            validInput = false; // La entrada no es válida, volver al inicio
                            break;
                    }
                    break; // Añadir break para salir del caso 1

                case 2:
                    System.out.println("Fiebre Alta");
                    break;
                case 3:
                    System.out.println("Confusión o desorientación");
                    break;
                default:
                    System.out.println("Síntoma no reconocido");
                    validInput = false; // La entrada no es válida, volver al inicio
                    break;
            }
        } while (!validInput); // Repetir el bucle si la entrada no es válida

        sc.close();
    }
}