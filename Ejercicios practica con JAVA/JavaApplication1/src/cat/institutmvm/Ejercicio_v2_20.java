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
public class Ejercicio_v2_20 {

    public static void main(String[] args) {
        int num=0;
        int[] arrayInt = new int[20];
        boolean correcte;
        Scanner scn = new Scanner(System.in);
        
        correcte = scn.hasNextInt();
        
        while (correcte){

             
            for (int i = 0; i < arrayInt.length - 1; i++) {

                    
                    
                for (int j = i + 1; j < arrayInt.length; j++) {

                    if (arrayInt[i] > arrayInt[j]) {

                        int canvi = arrayInt[i];
                        arrayInt[i] = arrayInt[j];
                        arrayInt[j] = canvi;
                     
                    }
                    System.out.println(arrayInt[i]);
                }
            }
        }
    }
}
