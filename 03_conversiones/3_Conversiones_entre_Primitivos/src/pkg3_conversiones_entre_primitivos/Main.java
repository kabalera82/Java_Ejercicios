/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_conversiones_entre_primitivos;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos a declarar unas variables

        byte num1 = 100;
        int num2 = 100;

        float num3 = 4000.123f;
        double num4 = 5000.123456748921d;

        //conversion de ampliación de primitivos (implicita/automatica)
        num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num4 = num3;
        System.out.println(num3);
        System.out.println(num4);

        //Conversiones de estrechamiento primitivo (explicita/manual)
        num1 = (byte) num2;
        System.out.println(num1);
        System.out.println(num2);

        num3 = (float) num4;
        System.out.println(num3);
        System.out.println(num4);
    }

}
