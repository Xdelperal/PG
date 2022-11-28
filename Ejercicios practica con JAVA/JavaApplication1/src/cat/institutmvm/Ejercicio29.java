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
public class Ejercicio29 {
    
    private static final String MSG_1 = "Introduce 20 valores: ";
    private static final String MSG_2 = "Estos son los numero introducidos  en forma descendente:";

    public static void main(String[] args) {
        int[] arrayInt = new int[20];
        int i;
        Scanner num = new Scanner(System.in);

        System.out.println(MSG_1);
        
        for (i = 0; i < arrayInt.length; i++) {
            do{
            arrayInt[i] = num.nextInt();
                
        
            }while(arrayInt[i] <1 || arrayInt[i] >9);
        }
        
        System.out.println(MSG_2);
        for (i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\n" + MSG_2);

        for (i = arrayInt.length-1; i >= 0; i--) {
            System.out.print(arrayInt[i] + " ");
        }
 
    }
}
