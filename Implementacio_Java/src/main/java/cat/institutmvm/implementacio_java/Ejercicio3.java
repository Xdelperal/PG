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
public class Ejercicio3 {

    /*
 * Nom: Xavier 
 * Cognom: Del Peral
 * INS Manuel Vázquez Montalbán
 * Data d'Edicio 30/10/2022 19:29
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
     */
    //Declaracion de los strings 
    private static final String MSG_1 = "Introduce un numero:";
    private static final String MSG_2 = "El numero es positivo";
    private static final String MSG_3 = "El numero es negativo";
    private static final String MSG_4 = "El numero es mayor que 35";
    private static final String MSG_4_2 = "El numero es menor a 35";
    private static final String MSG_5 = "El numero es menor que 100";
    private static final String MSG_5_2 = "El numero es mayor que 100";
    private static final String MSG_6 = "El numero esta en el intervalo [-3,27]";
    private static final String MSG_6_2 = "El numero no esta en el intervalo [-3,27]";
    private static final String MSG_7 = "El numero no esta dentro del intervalo de [25,50]";
    private static final String MSG_7_2 = "El numero esta dentro del intervalo de [25,50]";
    private static final String MSG_8 = "El primer numero es par";
    private static final String MSG_9 = "El primer numero es impar";
    private static final String MSG_10 = "El modulo del primer numero entre el del segundo es menor que 15";
    private static final String MSG_11 = "El modulo del primer numero entre el del segundo es mayor que 15";
    private static final String MSG_12 = "Introduce un segundo valor para hacer el modulo del primer numero entre el segundo:";
    private static final String MSG_13 = "El maximo de los dos numeros introducidos es ";
    private static final String MSG_13_1 = "El maximo de los tres numeros introducidos es ";
    private static final String MSG_14 = "Este es el primer numero introducido elevado al cuadrado ";
    private static final String MSG_15 = "Este es el primer numero introducido elevado al cubo ";
    private static final String MSG_16 = "Introduce dos valores para determinar cual es el maximo: ";
    private static final String MSG_17 = "Introduce tres valores para saber cual es el maximo: ";
    private static final String MSG_18 = "Introduce dos nombres para saber si el segundo valor es multiplo del otro: ";
    private static final String MSG_19 = "El segundo numero es multiplo del primero";
    private static final String MSG_20 = "El segundo numero no es multiplo del primero";

    public static void main(String[] args) {

        //Declaracion de variables y escaneo de teclado
        int num1, num2, num3;
        System.out.println(MSG_1);
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        num1 = scn.nextInt();
        System.out.println("");

        //Avaluacion de condiciones
        //Ejercicio 3a
        if (num1 < 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_2);
        }
        //Ejercicio 3b
        if (num1 > 35) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_4_2);
        }
        //Ejercicio 3c
        if (num1 < 100) {
            System.out.println(MSG_5);
        } else {
            System.out.println(MSG_5_2);
        }
        //Ejercicio 3d
        if (num1 >= -3 && num1 < 27) {
            System.out.println(MSG_6);
        } else {
            System.out.println(MSG_6_2);
        }
        //Ejercicio 3e
        if (num1 < 25 || num1 > 50) {
            System.out.println(MSG_7);

        } else {
            System.out.println(MSG_7_2);
        }
        System.out.println("");
        System.out.println("");

        //Ejercicio 3f
        System.out.println(MSG_12);

        num2 = scn.nextInt();

        if (num1 % num2 < 15) {
            System.out.println(MSG_10);
        } else {
            System.out.println(MSG_11);
        }
        //Ejercicio 3g

        if (num1 % 2 == 0) {
            System.out.println(MSG_8);
        } else {
            System.out.println(MSG_9);
        }
        //Ejercicio 3h

        if (num1 % 2 == 0) {
            num1 = num1 * num1;
            System.out.println(MSG_14 + num1);
        } else {
            num1 = num1 * num1 * num1;
            System.out.println(MSG_15 + num1);

        }

        System.out.println("");
        System.out.println("");

        //Ejercicio 3i
        System.out.println(MSG_16);

        num1 = scn.nextInt();
        num2 = scn.nextInt();
        if (num1 > num2) {
            System.out.println(MSG_13 + num1);
        } else {
            System.out.println(MSG_13 + num2);
        }
        //Ejercicio 3j
        System.out.println("");
        System.out.println(MSG_17);
        num1 = scn.nextInt();
        num2 = scn.nextInt();
        num3 = scn.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(MSG_13_1 + num1);
        } else {
            if (num2 > num3 && num2 > num1) {
                System.out.println(MSG_13_1 + num2);
            } else {
                if (num3 > num1 && num3 > num2) {
                    System.out.println(MSG_13_1 + num3);
                }

            }

        }
        //Ejercicio 3k
        System.out.println("");
        System.out.println(MSG_18);

        num1 = scn.nextInt();
        num2 = scn.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(MSG_19);

        } else {

            System.out.println(MSG_20);
        }

    }

}
