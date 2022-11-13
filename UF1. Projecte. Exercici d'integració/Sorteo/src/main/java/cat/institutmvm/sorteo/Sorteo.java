/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cat.institutmvm.sorteo;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class Sorteo {

    private static final String MSG_1 = "Id?: ";
    private static final String MSG_2 = "Edat?: ";
    private static final String MSG_3 = "Tipo de venta?: ";
    private static final String MSG_4 = "Importe de la compra?: ";
    private static final String MSG_5 = "Telefono de contacto?: ";
    private static final String MSG_6 = "Error introduzca un valor valido ";
    private static final String MSG_7 = "FINALIZACION DEL PROGRAMA POR ERROR DE DATOS";

    public static void main(String[] args) {

        int id = 0, edat=0, tlfn, tipo, cont = 0;
        boolean correcte;
        double imp;

        Scanner scn = new Scanner(System.in);
        do {

            if (cont < 3 && id < 111 || id > 999) {

                System.out.println(MSG_1);
                correcte = scn.hasNextInt();
                if (correcte) {
                    id = scn.nextInt();

                    if (id < 111 || id > 999) {
                        System.out.println(MSG_6);
                        id = 0;


                    }
                } else {
                    scn.next();
                    System.out.println(MSG_6);
                    id = 0;
                    cont = 0;

                }
                cont++;
                if (cont == 3 && id < 111 || id > 999) {
                    System.out.println(MSG_7);
                }
            }

        } while (cont < 3 && id < 111 || id > 999);
    
        
        scn.next();
        do {

            if (cont < 3 && edat < 14 || edat > 120) {

                System.out.println(MSG_2);
                correcte = scn.hasNextInt();
                if (correcte) {
                    edat = scn.nextInt();

                    if (id < 14 || id > 120) {
                        System.out.println(MSG_6);


                    }
                } else {
                    scn.next();
                    System.out.println(MSG_6);
                    
                }
                cont++;
                if (cont == 3 && edat < 14 || edat > 120) {
                    System.out.println(MSG_7);
                }
            }

        } while (cont < 3 && edat < 14 || edat > 120);
        
        
        
        
        
        
    }

}
