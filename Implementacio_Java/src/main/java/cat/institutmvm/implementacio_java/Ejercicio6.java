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
 * Data d'Edicio 31/10/2022 15:17
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */
public class Ejercicio6 {

    private static final String MSG_1 = "Introduce el numero del año: ";
    private static final String MSG_2 = "Introduce el numero del mes: ";
    private static final String MSG_3 = "El mes tiene ";
    

    public static void main(String[] args) {
        int año, mes, dias;
        System.out.println(MSG_1);
        Scanner num = new Scanner(System.in);
        año = num.nextInt();
        System.out.println(MSG_2);
        mes = num.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
            System.out.println(MSG_3 + dias + "dias");
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
                System.out.println(MSG_3 + dias + "dias");
            } else {
                if (mes == 2) {
                    if (año % 4 == 0 || año % 400 == 0) {
                        dias = 28;
                        System.out.println(MSG_3 + dias + "dias");
                    } else {
                        dias = 29;
                        System.out.println(MSG_3 + dias + "dias");
                    }
                }

            }

        }
    }

}
