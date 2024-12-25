package Unidad05.Unidad05;

public class unidad05 {




    do {
        System.out.println("Resultado de la exploración? \n"
                + "- 0 - Neumonía.\n"
                + "- 1 - Meningitis.\n"
                + "- 2 - Infección Viral.\n"
                + "- 3 - Reacción Alérgica.\n");
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
            System.out.println("Error de tipo. Introduce un aopción válida.");
            //LIMPIAMOS LA ENTRADA INCORRECTA
            sc.next();
            //BOOLEAN FALSE PARA MANTERNERNOS EN EL BUCLE
            correcto = false;
        }
        // hasta que no sea correcto nos mantenemos en el bucle
    } while (!correcto);







    
}
