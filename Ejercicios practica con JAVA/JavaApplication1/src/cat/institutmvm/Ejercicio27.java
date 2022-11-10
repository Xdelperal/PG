/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class Ejercicio27 {

    private static final String MSG_1 = "Introduce 20 valores: ";
    private static final String MSG_2 = "Estos son los valores de las posiciones senares: ";

    public static void main(String[] args) {
        int[] arrayInt = new int[20];
        int i;
        Scanner num = new Scanner(System.in);

        System.out.println(MSG_1);

        for (i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = num.nextInt();
        }
            System.out.println(MSG_2);

        for (i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
            i++;

        }

    }
}
