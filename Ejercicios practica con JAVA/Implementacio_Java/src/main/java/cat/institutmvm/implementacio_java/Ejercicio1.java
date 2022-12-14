/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.implementacio_java;

/**
 *
 * @author delpe
 */
public class Ejercicio1 {

    private static final String MSG_1 = "* * * * * * * * * *";

    public static void main(String[] args) {

        int i;
        String aster = "* ";
        System.out.println("Xavier Del Peral");
        System.out.println("Xavi");
        System.out.println("Del Peral");

        for (i = 0; i < 10; i++) {
            System.out.println(MSG_1);
        }

        System.out.println("");
        System.out.println("");

        for (i = 0; i < 10; i++) {
            System.out.println(aster);
            aster = aster + "* ";
        }
    }
}
