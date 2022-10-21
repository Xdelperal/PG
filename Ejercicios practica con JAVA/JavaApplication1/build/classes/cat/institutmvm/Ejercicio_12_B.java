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
public class Ejercicio_12_B {
private static final String MSG_1 = "Introduce un valor para saber el doble y el triple: ";
private static final String MSG_2 = "Este es el doble ";
private static final String MSG_3 = "Este es el triple ";

public static void main(String[] args) {
int num1;   
System.out.print(MSG_1);
System.out.println("");
Scanner numteclado = new Scanner  (System.in);
num1 = numteclado.nextInt();
    System.out.println(MSG_2 + (num1*2)+ MSG_3 + (num1*3) );
}
}