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
public class Ejercicio_17 {

    private static final String MSG_1 = "Introduce 2 números mayor a 0";
    private static final String MSG_2 = "El valor no es mayor a 0, por favor vuelve a introducir un valor";

    public static void main(String[] args) {
        int num1, num2;
        Scanner num = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = num.nextInt();
        while (num1 < 1){
            if (num1 < 1) {
                System.out.println(MSG_2);
                num1 = num.nextInt();
            }
        }
        
        num2 = num.nextInt();
        while (num2 < 1) {
            if (num2 < 1) {
                    System.out.println(MSG_2);
                    num2 = num.nextInt();
            }
        }
        if (num1 % num2 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        } else {
            if (num1 % num2 != 0) {
                System.out.println("El numero " + num1 + " no es multiplo de " + num2);
            }
        }

    }
}
