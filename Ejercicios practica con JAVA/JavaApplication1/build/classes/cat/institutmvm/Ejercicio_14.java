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
public class Ejercicio_14 {
    private static final String MSG_1 = "Introduce un valor para comprobar si esta dentro del rango entre 0 y 10";
    private static final String MSG_2 = "El valor esta dentro del rango";
    private static final String MSG_3 = "El valor esta fuera del rango introduce de nuevo un valor:";


    public static void main(String[] args) {
    float num = 0;
    
    System.out.println(MSG_1);
    
    Scanner numteclado = new Scanner(System.in);
    
    num = numteclado.nextInt();
    
    while (num<0 || num>10){
        System.out.println(MSG_3);
        System.out.println("");
        num = numteclado.nextInt();

    } 
    
    
        System.out.println(MSG_2);
        
        
    }

}

