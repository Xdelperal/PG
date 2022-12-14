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

/*
 * Nom: Xavier 
 * Cognom: Del Peral
 * INS Manuel Vázquez Montalbán
 * Data d'Edicio 31/10/2022 15:17
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */
public class Ejercicio8 {

    private static final String MSG_1 = "Introduce numeros enteros: ";

    public static void main(String[] args) {
        int num1;

        System.out.println(MSG_1);
        Scanner num = new Scanner(System.in);
        num1 = num.nextInt();
        
        
        //EJERCICIO 8 A
        while (num1 != 0) {
            System.out.println(MSG_1);
            num1 = num.nextInt();
        }
        
        
        
        

    }
}
