/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ejercicio_13 {

    private static final String MSG_1 = "El resultado es  ";
    private static final String MSG_2 = "Introduce 2 valores: ";

    public static void main(String[] args) {

        System.out.println(MSG_2);
        System.out.println("");
        float num1, num2;

        Scanner numteclado = new Scanner(System.in);

        num1 = numteclado.nextFloat();
        num2 = numteclado.nextFloat();

        System.out.println(MSG_1 + (num1 / num2));
    }
}