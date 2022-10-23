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

    public static void main(String[] args) {

        System.out.println(MSG_2);
        System.out.println("");
        int cont, num1 = 0, num2;

        Scanner numteclado = new Scanner(System.in);

        for (cont = 0; cont < 2; cont++) {

            num2 = numteclado.nextInt();

        }

        System.out.println(MSG_1 + (num1 / cont));
    }

}
