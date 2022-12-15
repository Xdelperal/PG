/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cat.institutmvm.metodos;

import java.util.Scanner;

/**
 *
 * @author delpe
 */
public class Metodos {

    public int val1;
    private static final String MSG_1 = "Introduce un nunmero por teclado";
    private static final String MSG_2 = "Es natural";
    private static final String MSG_3 = "No es natural";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int num1;
        Metodos method = new Metodos();
        
        
        

        num1 = method.validar();
        
        
        
        System.out.println(num1);

    }

    public int validar() {
        int num;
        boolean correcte;
        Scanner scn = new Scanner(System.in);
        do {
            correcte = scn.hasNextInt();
            if (!correcte) {
                System.out.println("INTRODUCE UN NUMERO");
                scn.next();
            } else {
                val1 = scn.nextInt();
            }
        } while (!correcte);
        return Math.abs(val1);
    }
}
