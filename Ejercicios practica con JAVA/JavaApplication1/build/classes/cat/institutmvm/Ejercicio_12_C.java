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
public class Ejercicio_12_C {

    private static final String MSG_1 = "Introduce tres valores";
    private static final String MSG_2 = "La suma de los dos numeros es mayor que el tercer numero introducido";
    private static final String MSG_3 = "La suma de los dos numeros es menor que el tercer numero introducido";

    public static void main(String[] args) {

        int num1, num2, num3;
        
        System.out.println(MSG_1);
        System.out.println("");

        Scanner numteclado = new Scanner(System.in);
        num1 = numteclado.nextInt();
        System.out.println("");

        num2 = numteclado.nextInt();
        System.out.println("");

        num3 = numteclado.nextInt();
        System.out.println("");

        if ((num1 + num2) > num3){
          System.out.println(MSG_2);   
        }
        else{
         System.out.println(MSG_3);
                 }
    }
}
