/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.implementacio_java;

import java.util.Scanner;

/**
 *
 * @author delpe
 */

/*
 * Nom: Xavier 
 * Cognom: Del Peral
 * INS Manuel Vázquez Montalbán
 * Data d'Edicio 30/10/2022 19:34
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */
public class Ejercicio3_apartado_l {

    private static final String MSG_1 = "CALCULO DE LA FACTURA DEL AGUA";
    private static final String MSG_2 = "Introduce la cantidad de litros consumidos: ";
    private static final String MSG_3 = "El total a pagar de la factura del agua es de ";

    public static void main(String[] args) {

        int cuota = 6;
        double cuota1, cuota2, num1;

        cuota1 = 0.1;
        cuota2 = 0.3;

        System.out.println(MSG_1);
        System.out.println("");
        System.out.println("");
        System.out.println(MSG_2);
        System.out.println("");
        System.out.println("");
        Scanner numeroteclado = new Scanner(System.in);

        num1 = numeroteclado.nextInt();

        if (num1 <= 50) {

            System.out.println(MSG_3 + cuota);
        } 
        
        
        else {
            if (num1 > 50 && num1 < 200) {

                num1 = num1 * cuota1 + cuota;
                num1 = (num1 * 100)/100;

                System.out.println(MSG_3 + num1 + "€");
            } 
            
                 
        else {
                if (num1 >= 200) {
                    num1 = num1 * cuota2 + cuota;
                    num1 = (num1 * 100)/100;
                    System.out.println(MSG_3 + num1 + "€");

                }

            }
        }
    }

}
