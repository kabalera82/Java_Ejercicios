
import java.util.Scanner;

/**
 *
 * @author kabalera
 */
public class GestionUrgenciasHospitalarias {

    public static final int NUSS_MIN = 10000000, NUSS_MAX = 99999999;
    public static final int PRIORIDAD_MIN = 0, PRIORIDAD_MAX = 5;
    public static final double TEMPERATURA_MIN = 35.0, TEMPERATURA_MAX = 45.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        int NUSS = 0, Sintoma = 0, Exploracion = 0, Prioridad = 0, Dolor = 0, Desorientación = 0;
        Double Temperatura = 0.0;
        //GENERAMOS EL COLOR CON EL CÓDIGO ANSI Y DESPUES LO RESETEAMOS PARA QUE NO AC
        String Azul = "\u001B[45m", Reset = "\u001B[0m";
        boolean correcto = false;

        // PROGRAMA PRINCIPAL
        // PEDIR DATOS DE UN PACIENTE
        // Pedimos número Seguridad Social y control errores
        // Bucle para el NUSS      
        do {
            System.out.println("Introduce el número de Seguridad Social (NUSS): ");
            // ¿es entero?
            if (sc.hasNextInt()) {
                //leemos la variable y rango
                NUSS = sc.nextInt();
                if ((NUSS >= NUSS_MIN) && (NUSS <= NUSS_MAX)) {
                    correcto = true;
                } else {
                    System.out.println("Error de rango.Introduzca un NUSS válido, en rango " + NUSS_MIN + " y " + NUSS_MAX);
                    correcto = false;
                }
            } else {
                System.out.println("Error de tipo. Introduce un número entero.");
                sc.next(); // Limpiar la entrada incorrecta
                correcto = false;
            }
        } while (!correcto);

        System.out.println("Número de Seguridad Social (NUSS) introducido: " + NUSS);
        //ENTRADA PARA LA TEMPERATURA

        do {
            System.out.println("¿Temperatura del paciente?");
            // COMPROBACIÓN DE SI ES UN NÚMERO DECIMAL
            if (sc.hasNextDouble()) {
                // LEEMOS LA VARIABLE Y EL RANGO
                Temperatura = sc.nextDouble();
                if ((Temperatura >= TEMPERATURA_MIN) && (Temperatura <= TEMPERATURA_MAX)) {
                    correcto = true;
                } else {
                    System.out.println("Error de rango. Valores válidos: " + TEMPERATURA_MIN + " - " + TEMPERATURA_MAX);
                    correcto = false;
                }
            } else {
                System.out.println("Error de tipo. Introduce un número decimal.");
                System.out.println("Valores válidos: " + TEMPERATURA_MIN + " - " + TEMPERATURA_MAX);
                sc.next(); // Limpiar la entrada incorrecta
                correcto = false;
            }
        } while (!correcto);

        //LOS SÍNTOMAS DEBEMOS METER UN VALOR ENTERO.
        do {
            //GENERAMOS EL MENU DE OPCIONES
            System.out.println("""                               
                Que síntomas tiene:
                - 0 - Dolor.
                - 1 - Lesión Traumática.
                - 2 - Fiebre Alta.
                - 3 - Confusión desorientación.
                        """);
            //A PARTIR DE AQUI COMPROBAREMOS SI LA ENTRADA ES ENTERO
            if (sc.hasNextInt()) {
                Sintoma = sc.nextInt();
                //SI ES CORRECTO ENTRAREMOS EN EL BUCLE
                correcto = true;

                switch (Sintoma) {
                    case 0:
                        //GENERAMOS OTRO BUCLE PARA COMPROBAR ENTRADA.
                        do {
                            System.out.println("""
                                           Tipo de dolor:
                                           - 0 - Dolor Torácico.
                                           - 1 - Dolor Abdominal.
                                           - 2 - Dolor de Cabeza.
                                           - 3 - Migraña.
                                           """);

                            //ENTRAREMOS DENTRO DEL MENU DOLOR 
                            if (sc.hasNextInt()) {
                                Dolor = sc.nextInt();
                                //SI LA ENTRADA ES CORRECTA ENTRAREMOS EN EL SWITCH.

                                switch (Dolor) {
                                    case 0:
                                        System.out.println("Dolor Torácico");
                                        break;
                                    case 1:
                                        System.out.println("Dolor Abdominal");
                                        break;
                                    case 2:
                                        System.out.println("Dolor de Cabeza");
                                        break;
                                    case 3:
                                        System.out.println("Migraña");
                                    default:
                                        System.out.println("Error en la entrada. Por favor, introduce un número del 0 al 3.");
                                        correcto = false;
                                        break;

                                }
                            } else {
                                System.out.println("Error de tipo. Introduce un aopción válida.");
                                //LIMPIAMOS LA ENTRADA INCORRECTA
                                sc.next();
                                //BOOLEAN FALSE PARA MANTERNERNOS EN EL BUCLE
                                correcto = false;
                            }
                            // hasta que no sea correcto nos mantenemos en el bucle
                        } while (!correcto);
                        break;
                    case 1:
                        System.out.println("Lesión Traumática");
                        do {
                            System.out.println("""
                                           Resultado de la exploración?
                                           - 0 - Fractura Ósea.
                                           - 1 - Herida de Bala.
                                           - 2 - Quemadura.
                                           - 3 - Lesión cerebral traumática.
                                           """);

                            //ENTRAREMOS DENTRO DEL MENU DOLOR 
                            if (sc.hasNextInt()) {
                                Dolor = sc.nextInt();
                                //SI LA ENTRADA ES CORRECTA ENTRAREMOS EN EL SWITCH.

                                switch (Dolor) {
                                    case 0:
                                        System.out.println("Fractura Ósea");
                                        break;
                                    case 1:
                                        System.out.println("Herida de Bala");
                                        break;
                                    case 2:
                                        System.out.println("Quemadura");
                                        break;
                                    case 3:
                                        System.out.println("Lesión cerebral traumática");
                                    default:
                                        System.out.println("Error en la entrada. Por favor, introduce un número del 0 al 3.");
                                        correcto = false;
                                        break;

                                }
                            } else {
                                System.out.println("Error de tipo. Introduce una opción válida.");
                                //LIMPIAMOS LA ENTRADA INCORRECTA
                                sc.next();
                                //BOOLEAN FALSE PARA MANTERNERNOS EN EL BUCLE
                                correcto = false;
                            }
                            // hasta que no sea correcto nos mantenemos en el bucle
                        } while (!correcto);
                        break;
                    case 2:
                        System.out.println("Fiebre Alta");
                        do {
                            System.out.println("""
                                           Resultado de la exploración? 
                                           - 0 - Neumonía.
                                           - 1 - Meningitis.
                                           - 2 - Infección Viral.
                                           - 3 - Reacción Alergica.
                                           """);
                            //ENTRAREMOS DENTRO DEL MENU DOLOR 
                            if (sc.hasNextInt()) {
                                Dolor = sc.nextInt();
                                //SI LA ENTRADA ES CORRECTA ENTRAREMOS EN EL SWITCH.

                                switch (Dolor) {
                                    case 0:
                                        System.out.println("Neumonía.");
                                        break;
                                    case 1:
                                        System.out.println("Meningitis.");
                                        break;
                                    case 2:
                                        System.out.println("Infección Viral.");
                                        break;
                                    case 3:
                                        System.out.println("Reacción Alérgica.");
                                    default:
                                        System.out.println("Error en la entrada. Por favor, introduce un número del 0 al 3.");
                                        correcto = false;
                                        break;

                                }
                            } else {
                                System.out.println("Error de tipo. Introduce una opción válida.");
                                //LIMPIAMOS LA ENTRADA INCORRECTA
                                sc.next();
                                //BOOLEAN FALSE PARA MANTERNERNOS EN EL BUCLE
                                correcto = false;
                            }
                            // hasta que no sea correcto nos mantenemos en el bucle
                        } while (!correcto);
                        break;
                    case 3:
                        System.out.println("Confusión desorientación");
                        do {
                            System.out.println("""
                                           Causas de la desorientación:
                                           - 0 - Intoxicación por drogas o alcohol.
                                           - 1 - Deshidratación severa.
                                           - 2 - Accidente cerebrovascular.
                                           - 3 - Hipoglucemia severa.
                                           """);

                            if (sc.hasNextInt()) {
                                Desorientación = sc.nextInt();
                                // SI ES UN ENTERO ENTRAMOS EN EL SWITCH
                                switch (Desorientación) {
                                    case 0:
                                        System.out.println("Intoxicación por drogas o alcohol");
                                        break;
                                    case 1:
                                        System.out.println("Deshidratación severa.");
                                        break;
                                    case 2:
                                        System.out.println("Accidente cerebrovascular");
                                        break;
                                    case 3:
                                        System.out.println("Hipoglucemia severa.");
                                        break;
                                    default:
                                        System.out.println("Error en la entrada. Por favor, introduce un número del 0 al 3.");
                                        break;
                                }
                            } else {
                                System.out.println("Introduce una opción válida.");
                                //HAY QUE ACORDARSE DE LIMPIAR LA ENTRADA ERRONEA
                                sc.next();
                                //boolean correcto nos mantiene en el bucle
                                correcto = false;

                            }

                        } while (!correcto);
                        break;
                    default:
                        System.out.println("Error en la entrada. Por favor, introduce un número del 0 al 3.");
                        correcto = false;
                        break;
                }
                //SI NO ES CORRECTO POR NO INTRODUCIR UN ENTERO PEDIREMOS QUE LO VUELVA A INTRODUCIR

            } else {
                System.out.println("Error de tipo. Introduce una opción válida.");
                sc.next(); // Limpiar la entrada incorrecta
                //LA EL BOOLEAN CORRECTO SEGUIRA SIENDO FALSE.
                correcto = false;
            }
            //HASTA QUE NO SEA CORRECTO NOS MANTENDREMOS DENTRO DEL BUCLE
        } while (!correcto);
        //Exploración inicial
        //int NUSS = 0, Sintoma = 0, Exploracion = 0, prioridad = 0, temperatura = 0, Dolor = 0, Desorientación = 0;
        //ENTRADA PARA EL NIVEL DE PRIORIDAD
        do {
            System.out.println("""
                           Que nivel de prioridad tiene?:
                           - 0 -
                           - 1 -
                           - 2 -
                           - 3 -
                           - 4 -
                           - 5 -
                           """);
            // ¿es entero?
            if (sc.hasNextInt()) {
                //leemos la variable y rango
                Prioridad = sc.nextInt();
                if ((Prioridad >= PRIORIDAD_MIN) && (Prioridad <= PRIORIDAD_MAX)) {
                    correcto = true;
                } else {
                    System.out.println("Error de rango. Valores válidos: " + PRIORIDAD_MIN + " - " + PRIORIDAD_MAX);
                    correcto = false;
                }
            } else {
                System.out.println("Error de tipo. Introduce un número entero.");
                System.out.println("Valores validos: " + PRIORIDAD_MIN + " - " + PRIORIDAD_MAX);
                sc.next(); // Limpiar la entrada incorrecta
                correcto = false;
            }
        } while (!correcto);

        System.out.print(
                Azul + "NUSS: " + " Exploracion: " + Exploracion + " Prioridad: " + Prioridad +" Temperatura: " + Temperatura + " Dolor: " + Dolor + " Desorientación: " + Desorientación
        );

        sc.close();
    }
}
