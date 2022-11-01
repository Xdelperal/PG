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
 * Data d'Edicio 31/10/2022 1:17
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */
public class Ejercicio8b {
        private static final String MSG_1 = "Indica cuantos numeros quieres introducir:  ";
        private static final String MSG_2 = "Introduce un numero entero: ";
        private static final String MSG_3 = "Gracias por utilizar el programa!";
    public static void main(String[] args) {
        int num1,num2, cont=0;

        System.out.println(MSG_1);
        Scanner num = new Scanner(System.in);
        num1 = num.nextInt();
                
        while (cont<num1){
            System.out.println(MSG_2);
            num2 =num.nextInt();
            cont=cont+1;
        
        }
        
        System.out.println(MSG_3);
    }      
    
}
