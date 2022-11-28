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
public class Ejercicios_v2_22 {
   
    private static final String MSG_1 ="Introdueix 20 nombres: ";
    private static final String MSG_2 = "Introdueix el nombre que vols comprovar: ";
    private static final String MSG_3 = "S'ha trobat un valor";
    private static final String MSG_4 = "No s'ha trobat un valor";
   
    public static void main(String[] args){
        int i, num = 0 ;
        boolean trobat = false;
        int[] arrayint = new int[20];
        Scanner sc = new Scanner(System.in);
       
        System.out.println(MSG_1);
       
        for (i = 0; i < arrayint.length; i++) {
            arrayint[i] = sc.nextInt();
        }
       
        System.out.println(MSG_2);
        num = sc.nextInt();
       
        for (i = 0; i < arrayint.length; i++){
            if (arrayint[i] == num){
                trobat = true;
            }
        }
        if (trobat){
            System.out.println(MSG_3);
        }
        else{
            System.out.println(MSG_4);
        }
       
    }
}

