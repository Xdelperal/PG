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
public class Ejercicio_16 {

    private static final String MSG_1 = "Introduce un valor para saber si es natural o no, solo tienes 3 intentos:";
    private static final String MSG_2 = "El valor no es natural, por favor, vuelva a introducir un valor, te quedan ";
    private static final String MSG_3 = "El valor es natural";
    private static final String MSG_4 = "Has superado el numero de intentos";

    public static void main(String[] args) {
        int num, att = 3;

        Scanner numteclado = new Scanner(System.in);

        System.out.println(MSG_1);

        num = numteclado.nextInt();

        while (num < 0 && att >1) {att--;System.out.println(MSG_2 + att + " intentos");num = numteclado.nextInt();
       }
        
        if(att == 1 ){
            System.out.println(MSG_4);
        } 
        if (num > 0 ){
            System.out.println(MSG_3);
        }
    }
}
