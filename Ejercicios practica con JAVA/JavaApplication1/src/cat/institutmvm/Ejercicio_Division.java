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
public class Ejercicio_Division {

    private static final String MSG_1 = "El resultado  ";
    private static final String MSG_2 = "Introduce 2 valores: ";
    private static final String MSG_3 = "Introduce un numero diferente a 0";

    public static void main(String[] args) {

        System.out.println(MSG_2);
        System.out.println("");
        float cont, num1 = 0, num2;

        Scanner numteclado = new Scanner(System.in);

        num1 = numteclado.nextInt();

        num2 = numteclado.nextInt();

        while (num2 == 0) {
            System.out.println(MSG_3);
            num2 = numteclado.nextInt();
        }
        System.out.println(MSG_1 + (num1 / num2));

    }

}
