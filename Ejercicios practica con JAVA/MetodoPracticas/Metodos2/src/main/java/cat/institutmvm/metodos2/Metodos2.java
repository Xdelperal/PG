/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cat.institutmvm.metodos2;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class Metodos2 {
    private static double PI = 3.1416;
    private static final String MSG_1 = "Introduce el radio de una circumferencia";
    private static final String MSG_2 = "Es natural";
    private static final String MSG_3 = "No es natural";

    public static void main(String[] args) {
        Metodos2 method = new Metodos2();
        System.out.println(MSG_1);
        System.out.println(method.validar()*PI*2);
    }

    public int validar() {
        int num=0;
        boolean correcte;
        Scanner scn = new Scanner(System.in);
        do {
            correcte = scn.hasNextInt();
            if (!correcte) {
                System.out.println("INTRODUCE UN NUMERO");
                scn.next();
            } else {
                num = scn.nextInt();
            }
        } while (!correcte);
        return num;
    }
}


