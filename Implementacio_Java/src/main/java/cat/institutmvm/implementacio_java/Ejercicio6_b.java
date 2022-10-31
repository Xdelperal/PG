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
 * Data d'Edicio 31/10/2022 19:23
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */
public class Ejercicio6_b {

    private static final String MSG_1 = "Introduce el numero del mes para saber cuantos dias tiene: ";
    private static final String MSG_2 = "Introduce el numero del año: ";

    public static void main(String[] args) {

        String mes = "";
        int num1, num2, dias = 0;

        Scanner num = new Scanner(System.in);
        System.out.println(MSG_2);

        num2 = num.nextInt();

        System.out.println(MSG_1);

        num1 = num.nextInt();
        switch (num1) {

            case 1:
                mes = "Enero";
                dias = 31;
                break;

            case 3:
                mes = "Marzo";
                dias = 31;
                break;

            case 5:
                mes = "Mayo";
                dias = 31;
                break;

            case 7:
                mes = "Julio";
                dias = 31;
                break;

            case 8:
                mes = "Agosto";
                dias = 31;
                break;

            case 10:
                mes = "Octubre";
                dias = 31;
                break;

            case 12:
                mes = "Diciembre";
                dias = 31;
                break;

            case 4:
                mes = "Abril";
                dias = 30;
                break;

            case 6:
                mes = "Junio";
                dias = 30;
                break;

            case 9:
                mes = "Septiembre";
                dias = 30;
                break;
            case 11:
                mes = "Noviembre";
                dias = 30;
                break;

            case 2:
                mes = "Febrero";
                if (num2 % 4 == 0 || num2 % 400 == 0) {
                    dias = 28;
                } else {
                    dias = 29;
                }
                break;

            default:
                System.out.println("Error introduce un numero entre el 1 y el 12");
                break;

        }
        System.out.println("El mes introducido es " + mes + " y tiene " + dias + " dias");

    }
}
