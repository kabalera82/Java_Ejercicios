/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kabalera
 */
public class RetoModulo2 {

    /**
     * Desarrolla un programa que realice cálculos básicos, muestre resultados
     * en la consola, aplicando buenas prácticas en el uso de sintaxis,
     * declaración de variables, operaciones y casteo.
     *
     * @param args
     *
     */
    //Declaracion de Constante
    private static final int MEJOR_AÑO_HISTORIA = 1982;

    public static void main(String[] args) {

        // Declaración de variables primitivas
        byte numeroPequeño = 10;
        // Tamaño: 8 bits
        // Rango: -128 a 127
        short numeroCorto = 1000;
        // Tamaño: 16 bits
        // Rango: -32,768 a 32,767
        int numeroEntero = 42;
        // Tamaño: 32 bits
        // Rango: -2^31 a 2^31-1
        long numeroLargo = 100000L;
        // Tamaño: 64 bits
        // Rango: -2^63 a 2^63-1
        float numeroFlotaDecimales = 10.99f;
        // Tamaño: 32 bits
        double numeroDobleDecimales = 10.9999;
        // Tamaño: 64 bits
        char caracteres = 'a';
        char ascii = 97; // a
        // Tamaño: 16 bits
        // se puede declarar así o como ASCII 
        boolean positivoNegativo = MEJOR_AÑO_HISTORIA > 0;

        System.out.println(MEJOR_AÑO_HISTORIA);
        System.out.println(numeroPequeño);
        System.out.println(numeroCorto);
        System.out.println(numeroEntero);
        System.out.println(numeroLargo);
        System.out.println(numeroFlotaDecimales);
        System.out.println(numeroDobleDecimales);
        System.out.println(caracteres);
        System.out.println(ascii);
        System.out.println(positivoNegativo);

        // Operaciones Aritméticas
        System.out.println(numeroPequeño - 10);
        System.out.println(numeroCorto - 1000);
        System.out.println(numeroEntero - 42);
        System.out.println(numeroLargo - 100000L);
        System.out.println(numeroFlotaDecimales - 10.99f);
        System.out.println(numeroDobleDecimales - 10.9999);
        System.out.println(caracteres - 'A');
        System.out.println(ascii - 97);
        System.out.println(positivoNegativo);

        System.out.println(numeroPequeño + -10);
        System.out.println(numeroCorto + -1000);
        System.out.println(numeroEntero + -42);
        System.out.println(numeroLargo + -100000L);
        System.out.println(numeroFlotaDecimales + -10.99f);
        System.out.println(numeroDobleDecimales + -10.9999);
        System.out.println("agu"+caracteres);
        System.out.println("agu"+ascii);
        
        int resto;
        resto = numeroEntero%2;        
        System.out.println(resto);
        
        double division;
        division = numeroDobleDecimales/2;        
        System.out.println(division);
        
        int multiplicacion;
        multiplicacion = numeroEntero*2;
        System.out.println(multiplicacion);
        
        // casteo explícito
        short pequeñoAShort = (short) numeroPequeño;        
        System.out.println(pequeñoAShort);
        int cortoAEntero = (int) numeroCorto;
        System.out.println(cortoAEntero);
        long enteroALargo = (long) numeroEntero;
        System.out.println(enteroALargo);
        double flotadoADoble = (double) numeroFlotaDecimales;
        System.out.println(flotadoADoble);

        // truncar decimales
        
        int sinDecimales = (int) numeroDobleDecimales;
        System.out.println(sinDecimales);
        
      
        
        
    }

}
