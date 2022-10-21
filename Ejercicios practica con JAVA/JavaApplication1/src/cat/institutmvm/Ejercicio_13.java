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

    private static final String MSG_1 = "La media es ";
    private static final String MSG_2 = "Introduce 5 valores: ";


    public static void main(String[] args) {

        System.out.println(MSG_2);
        System.out.println("");
        int cont, avg = 0, num;

        Scanner numteclado = new Scanner(System.in);

        for (cont = 0; cont < 5; cont++) {

            num = numteclado.nextInt();
            avg  = (avg + num);

        }
        
        System.out.println(MSG_1 + (avg/cont));   
    }


}
