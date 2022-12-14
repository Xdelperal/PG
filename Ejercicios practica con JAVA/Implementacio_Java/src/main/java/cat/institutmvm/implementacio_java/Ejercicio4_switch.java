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
public class Ejercicio4_switch {

    private static final String MSG_20 = "Introce el numero del mes: ";

    public static void main(String[] args) {

        int num1;
        System.out.println(MSG_20);
        Scanner num = new Scanner(System.in);
        num1 = num.nextInt();
        switch (num1) {

            case 1:
                System.out.println("Enero");
                break;

            case 2:
                System.out.println("Febrero");
                break;

            case 3:
                System.out.println("Marzo");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Mayo");
                break;

            case 6:
                System.out.println("Junio");
                break;

            case 7:
                System.out.println("Julio");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Septiembre");
                break;

            case 10:
                System.out.println("Octubre");
                break;

            case 11:
                System.out.println("Noviembre");
                break;

            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("Error introduce un numero entre el 1 y el 12");
                break;
        }

    }
}
