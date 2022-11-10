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
public class Ejercicio26 {

    private static final String MSG_1 = "Introduce 20 valores: ";

    public static void main(String[] args) {
        int[] arrayInt = new int[20];
        int i;
        Scanner num = new Scanner(System.in);

        System.out.println(MSG_1);

        for (i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = num.nextInt();

            if (arrayInt[i] % 5 == 0) {
                arrayInt[i] = arrayInt[i] + 3;
            } else if (arrayInt[i] % 3 == 0) {
                arrayInt[i] = arrayInt[i] - 3;

            }
        }
        for (i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
    }
}
