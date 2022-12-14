/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.olympiadas;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class OLYMPIADAS_2 {

    public static void main(String[] args) {

        int i, lon;
        Scanner num = new Scanner(System.in);

        System.out.println("Introduce la cantidad de valores que quieres almacenar");

        lon = num.nextInt();
        int[] arrayInt = new int[lon];

        System.out.println("Introduce los valores");

        for (i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = num.nextInt();

        }

        System.out.println("Valores de forma descendente");

        for (i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(arrayInt[i] + " ");
        }

    }
}
