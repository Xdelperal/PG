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
 * Data d'Edicio 31/10/2022 12:40
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */

public class Ejercicio5 {

    private static final String MSG_1 = "El año es bisiesto", MSG_2 = "El año no es bisiesto";
    private static final String MSG_3 = "Introduce el año para comprobar si es bisiesto o no: ";

    public static void main(String[] args) {

        int num1;

        System.out.println(MSG_3);
        Scanner num = new Scanner(System.in);
        num1 = num.nextInt();
        if (num1 % 4 == 0 || num1 % 400 == 0) {
            System.out.println(MSG_1);

        } else {

            System.out.println(MSG_2);
        }

    }

}
