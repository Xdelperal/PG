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
public class Ejercicio_17 {
    private static final String MSG_1 = "Introduce 3 números mayor a 0";
  public static void main(String[] args){
      int num1, num2;
      Scanner num = new Scanner(System.in);
      System.out.println(MSG_1);
     do{num1 = num.nextInt(); num2 = num.nextInt(); System.out.println(MSG_1);
     }while(num1<1 || num2 <1);
     
     // arreglar con if else ifelse
    if (num1%num2 == 0) {
        System.out.println("El numero " + num1 + " es multiplo de " + num2);
    }
    else{
        System.out.println("El numero " + num1 + " no es multiplo de " + num2);
    }
  }
}
