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
public class Ejercicio31 {
    
private static final String MSG_1 ="Introdueix un nombre";
    
    public static void main(String[] args){
        int num, res = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                num = sc.nextInt();
                while(num !=0){
                        num = (num / 10);
                        res = res + 1;
                }
            }
            else{
                sc.next();
                System.out.println("Error");
            }
        }while(!valorCorrecte);
        System.out.println(res);
    }
}
