/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_joptionpane_confirmdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = JOptionPane.showConfirmDialog(null, "Elige una opción");

        System.out.println(opcion);

        //vamos a meter un condicional
        /*        if (opcion == 0) {
            System.out.println("Has eleigdo la opcion YES");
        } else if (opcion == 1) {
            System.out.println("Has eleigdo la opcion NO");
        } else if (opcion == 2) {
            System.out.println("ERROR");
        }
         */
        switch (opcion) {
            case 0 ->
                System.out.println("Has eleigdo la opcion YES");
            case 1 ->
                System.out.println("Has eleigdo la opcion NO");
            case 2 ->
                System.out.println("ERROR");
            default -> {
            }
        }
    }

}
