/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_jopntionpane;

/**
 *
 * @author kabal
 */
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //leer un texto con JOptionPane
        /*
        String variable = "";
        variable = JOptionPane.showInputDialog(null, "Introduce un texto", "Lector", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(variable);
         */
        //leer un numero con JOptionPane

        String numeroTexto = JOptionPane.showInputDialog("Introduce un numero");
        int numero = Integer.parseInt(numeroTexto);
        System.out.println(numero);
        
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        System.out.println(numero2);

    }

}
