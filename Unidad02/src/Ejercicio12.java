/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kabadev
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        /*
        * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
        * Hay que tener en cuenta que existen meses con 28, 30 y 31 días (no se considerará los años bisiestos). 
        */
        int dia, mes, año;
        boolean fechaCorrecta; // Inicializar la variable
        try (Scanner sc = new Scanner(System.in)) { // Utilizar try-with-resources
            System.out.println("Introduce el día: ");
            dia = sc.nextInt();
            System.out.println("Introduce el mes: ");
            mes = sc.nextInt();
            System.out.println("Introduce el año: ");
            año = sc.nextInt();

            if (año == 0) { // No existe el año 0
                fechaCorrecta = false;
            } else {
                if (mes == 2 && (1 <= dia && dia <= 28)) {
                    fechaCorrecta = true;
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <= 30)) {
                    fechaCorrecta = true;
                } else if (1 <= dia && dia <= 31) {
                    fechaCorrecta = true;
                } else {
                    fechaCorrecta = false;
                }
            }

            if (fechaCorrecta) {
                System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
            } else {
                System.out.println("Fecha incorrecta");
            }
            sc.close(); 
        }
       

    }
}