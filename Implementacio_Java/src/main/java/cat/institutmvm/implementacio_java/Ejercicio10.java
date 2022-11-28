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
public class Ejercicio10 {

    private static final String MSG_1 = "Introduce un valor: ";
    private static final String MSG_2 = "Introduce un segundo valor: ";

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        boolean valorCorrecte;
        Scanner num = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println(MSG_1);
            valorCorrecte = num.hasNextInt();
            if (valorCorrecte) {
                num1 = num.nextInt();
            } else {
                
                num.next();
            }
            System.out.println("");
            System.out.println(MSG_2);
            valorCorrecte = num.hasNextInt();
            if (valorCorrecte) {
                num2 = num.nextInt();
            } else {
                num.next();
            }
        } while (!valorCorrecte || num2 < num1 || num1 <= 0 || num2 <= 0);

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }

    }

}
