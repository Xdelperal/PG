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
 * Data d'Edicio 31/10/2022 12:34
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */

public class Ejercicio4 {

    private static final String MSG_1 = "Enero", MSG_2 = "Febrero", MSG_3 = "Marzo", MSG_4 = "Abril", MSG_5 = "Mayo", MSG_6 = "Junio", MSG_7 = "Julio", MSG_8 = "Agosto", MSG_9 = "Septiembre", MSG_10 = "Octubre", MSG_11 = "Noviembre", MSG_12 = "Diciembre";
    private static final String MSG_20 = "Introce el numero del mes";

    public static void main(String[] args) {
        int num1;

        System.out.println(MSG_20);
        Scanner numteclado = new Scanner(System.in);
        num1 = numteclado.nextInt();
        if (num1 == 1) {
            System.out.println(MSG_1);
        } else {
            if (num1 == 2) {
                System.out.println(MSG_2);
            } else {
                if (num1 == 3) {
                    System.out.println(MSG_3);
                } else {
                    if (num1 == 4) {
                        System.out.println(MSG_4);
                    } else {
                        if (num1 == 5) {
                            System.out.println(MSG_5);
                        } else {
                            if (num1 == 6) {
                                System.out.println(MSG_6);
                            } else {
                                if (num1 == 7) {
                                    System.out.println(MSG_7);
                                } else {
                                    if (num1 == 8) {
                                        System.out.println(MSG_8);
                                    } else {
                                        if (num1 == 9) {
                                            System.out.println(MSG_9);
                                        } else {
                                            if (num1 == 10) {
                                                System.out.println(MSG_10);
                                            } else {
                                                if (num1 == 11) {
                                                    System.out.println(MSG_11);
                                                } else {
                                                    if (num1 == 12) {
                                                        System.out.println(MSG_12);
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
