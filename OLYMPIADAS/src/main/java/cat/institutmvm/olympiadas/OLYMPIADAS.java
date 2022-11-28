/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cat.institutmvm.olympiadas;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class OLYMPIADAS {

    public static void main(String[] args) {
        int num1, num2, num3;

        System.out.println("Introduce un valor ");

        Scanner scn = new Scanner(System.in);
        num1 = scn.nextInt();

        System.out.println("Introduce un segundo valor");

        num2 = scn.nextInt();

        System.out.println("Introduce un tercer valor para comprobar si esta dentro del rango limitado por los dos primeros numeros");

        num3 = scn.nextInt();

        if (num3 > num1 && num3 < num2) {
            System.out.println("Esta dentro del  rango");

        } else {

            System.out.println("Esta fuera del rango");
        }
    }
}
