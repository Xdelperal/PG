/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cat.institutmvm.ejercicionsarrays;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class EjercicionsArrays {

    private static final String MSG_1 = "Indrodueix un nombre: ";
    private static final String MSG_2 = "Error numero no valido";
    private static final String MSG_3 = "Indrodueix un altre nombre: ";
    private static final String MSG_4 = "---Opciones----";
    private static final String MSG_5 = "---------------";
    private static final String MSG_6 = "--1. Sumar";
    private static final String MSG_7 = "--2. Restar";
    private static final String MSG_8 = "--3. Multiplicar";
    private static final String MSG_9 = "--4. Dividir";
    private static final String MSG_10 = "El resultado de la operación es :";

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, sw = 0, res = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num1 = sc.nextInt();
            } else {
                sc.next();
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);

        do {
            System.out.println(MSG_3);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num2 = sc.nextInt();
            } else {
                sc.next();
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);

        System.out.println(MSG_4);
        System.out.println(MSG_5);
        System.out.println(MSG_6);
        System.out.println(MSG_7);
        System.out.println(MSG_8);
        System.out.println(MSG_9);
        System.out.println(MSG_5);

        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                sw = sc.nextInt();
                switch (sw) {
                    case 0:
                        break;

                    case 1:
                        System.out.print("\n" + MSG_10 + (num1 + num2) + "\n");
                        break;
                    case 2:
                        System.out.print("\n" + MSG_10 + (num1 - num2) + "\n");
                        break;
                    case 3:
                        System.out.print("\n" + MSG_10 + (num1 * num2) + "\n");
                        break;
                    case 4:
                        System.out.print("\n" + MSG_10 + (num1 / num2) + "\n");
                        break;
                    default:
                        System.out.println(MSG_2);
                        break;
                }
            } else {
                sc.next();
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);
    }

}
        