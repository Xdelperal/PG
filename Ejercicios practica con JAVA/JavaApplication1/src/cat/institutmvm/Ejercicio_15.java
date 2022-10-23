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
public class Ejercicio_15 {

    private static final String MSG_1 = "Introduce un valor para saber si es natural o no:";
    private static final String MSG_2 = "El valor no es natural, por favor, vuelva a introducir un valor:";
    private static final String MSG_3 = "El valor es natural";

    public static void main(String[] args) {
        int num;

        Scanner numteclado = new Scanner(System.in);

        System.out.println(MSG_1);

        num = numteclado.nextInt();

        while (num < 1) {
            System.out.println(MSG_2);
            num = numteclado.nextInt();

        }

        if (num > 1) {
            System.out.println(MSG_3);

        }
    }

}
