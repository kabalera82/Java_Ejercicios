/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_if.pkgelse.anidados;
import javax.swing.JOptionPane;

/**
 *
 * @author kabal
 */
public class ElseAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicita al usuario que introduzca un número
        String numeroStr = JOptionPane.showInputDialog("Introduce un número: ");
        
        // Convierte la cadena de texto a un número entero
        int numero = Integer.parseInt(numeroStr);
        
        // Evalúa el valor del número introducido
        if (numero <= 3) {
            System.out.println("de 1 a 3");
        } else if (numero > 3 && numero <= 6) {
            System.out.println("de 3 a 6");
        } else if (numero > 6 && numero <= 9) {
            System.out.println("de 7 a 9");
        } else {
            System.out.println("10");
        }
    }  
}

