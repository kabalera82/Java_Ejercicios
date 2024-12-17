/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_conversiones_primitivos_strings;

/**
 *
 * @author kabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaración de variable de tipo string

        String numero = "";

        //byte a string
        byte num1 = 1;

        numero = Byte.toString(num1);
        System.out.println("byte to string (forma 1): " + numero);
        numero = String.valueOf(num1);
        System.out.println("byte to Strong (forma 2): " + numero);
        numero = num1 + "";
        System.out.println("byte to string (forma3): " + numero);

        //short a string
        short num2 = 2;

        numero = Short.toString(num2);
        System.out.println("to string (forma 1): " + numero);
        numero = String.valueOf(num2);
        System.out.println("short to string: " + numero);
        numero = num2 + "";
        System.out.println("short to string: " + numero);

        // integer to string
        int num3 = 3;

        numero = Integer.toString(num3);
        System.out.println("short to tring :" + numero);
        numero = String.valueOf(num3);
        System.out.println("integer to string: " + numero);
        numero = num3 + "";
        System.out.println("integer to string: " + numero);

        //Long to string
        String numero2 = "";
        long num4 = 4l;
        numero2 = Long.toString(num4);
        System.out.println("long to string:" + numero2);
        numero2 = String.valueOf(num4);
        System.out.println(numero2 + numero);
        numero = num4 + "";
        System.out.println("long to string:" + numero2);

        //Float to string
        float num5 = 5.001f;
        numero = Float.toString(num5);
        System.out.println("float to string: " + numero);
        numero = String.valueOf(num5);
        System.out.println("float to string: " + numero);
        numero = num5 + "";
        System.out.println("float to string: " + numero);

        //Double to string
        double num6 = 6.0d;
        numero = Double.toString(num6);
        System.out.println("double to string: " + numero);
        numero = String.valueOf(num6);
        System.out.println("double to string: " + numero);
        numero = num6 + "";
        System.out.println("double to string: " + numero);
        
        //char a string
        
        char caracter = 'b';
        String texto =  Character.toString(caracter);
        System.out.println("char to string: " + caracter);
        
    }

}
