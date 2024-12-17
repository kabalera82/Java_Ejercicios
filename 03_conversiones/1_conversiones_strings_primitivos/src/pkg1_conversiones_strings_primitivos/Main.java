/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_conversiones_strings_primitivos;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaración de variable tipo string

        String texto = "hola";

        //conversion de string a char
        char caracter = texto.charAt(0);
        System.out.println(caracter);

        //-------------------
        String numero = "10";

        //string a byte
        byte num1 = Byte.parseByte(numero);
        System.out.println("String a byte: " + num1);

        byte num2 = Byte.valueOf(numero);
        System.out.println("String a byte: " + num2);

        //string a short
        short num3 = Short.parseShort(numero);
        System.out.println("String a short " + num3);

        short num4 = Short.valueOf(numero);
        System.out.println("String a short " + num4);

        //string a integer
        int num5 = Integer.parseInt(numero);
        System.out.println("String a integer :" + num5);

        int num6 = Integer.valueOf(numero);
        System.out.println("String a integer :" + num6);

        // String a long
        long num7 = Long.parseLong(numero);
        System.out.println("String a long :" + num7);

        long num8 = Long.valueOf(numero);
        System.out.println("String a long :" + num8);

        // String a float
        float num9 = Float.parseFloat(numero);
        System.out.println("String a float: " + num9);

        float num10 = Float.valueOf(numero);
        System.out.println("String a float: " + num10);

        //String a Double
        double num11 = Double.parseDouble(numero);
        System.out.println("String a double: " + num11);

        double num12 = Double.valueOf(numero);
        System.out.println("String double: " + num12);
    }

}
