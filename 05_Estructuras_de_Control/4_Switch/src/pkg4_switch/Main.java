/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_switch;

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
        //pedimos un numero por dialogo
        String numeroStr = JOptionPane.showInputDialog("Introduce un numero");
        // System.out.println(numeroStr); // texto
        //convertimos el string a int.
        //int numero = Integer.parseInt(numeroStr);
        //mostramos numero por dialog        
        //JOptionPane.showMessageDialog(null,numero);
        /*        switch (numeroStr) {
            case "Juan":
                JOptionPane.showMessageDialog(null, "Es el equipo 1");
                break;
            case "Pedro":
                JOptionPane.showMessageDialog(null, "Es el equipo 2");
                break;
            case "Paco":
                JOptionPane.showMessageDialog(null, "Es el equipo 3");
                break;
            case "de":
                JOptionPane.showMessageDialog(null, "Es el equipo 4");
                break;
            case "la":
                JOptionPane.showMessageDialog(null, "Es el equipo 5");
                break;
            default:

                JOptionPane.showMessageDialog(null, "Juan Paco Pedro de la mar Es mi nombre asi");
                break;
        }
        */
        switch (numeroStr) {
            case "Juan" -> JOptionPane.showMessageDialog(null, "Es el equipo 1");
            case "Pedro" -> JOptionPane.showMessageDialog(null, "Es el equipo 2");
            case "Paco" -> JOptionPane.showMessageDialog(null, "Es el equipo 3");
            case "de" -> JOptionPane.showMessageDialog(null, "Es el equipo 4");
            case "la" -> JOptionPane.showMessageDialog(null, "Es el equipo 5");
            default -> JOptionPane.showMessageDialog(null, "Juan Paco Pedro de la mar Es mi nombre asi");
        }

    }

}
