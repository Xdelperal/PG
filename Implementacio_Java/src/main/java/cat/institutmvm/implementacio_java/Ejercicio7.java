/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.implementacio_java;

/**
 *
 * @author delpe
 */

/*
 * Nom: Xavier 
 * Cognom: Del Peral
 * INS Manuel Vázquez Montalbán
 * Data d'Edicio 31/10/2022 15:17
 * Nom del cicle formatiu: DAW
 * Nom del modul: PG
 */
public class Ejercicio7 {

    private static final String MSG_1 = "Estos son los numeros del 0 al 10: ";
    private static final String MSG_2 = "Estos son los numeros del 0 al 100: ";
    private static final String MSG_3 = "Estos son los numeros pares del 0 al 100";

    public static void main(String[] args) {
        int cont = -1, nums = 0;

        //APARTADO 7 A
        System.out.println(MSG_1);
        while (cont < 10) {
            cont = cont + 1;
            System.out.println(cont);

        }
        //APARTADO 7 B
        System.out.println(MSG_2);
        cont = -1;
        while (cont < 100) {
            cont = cont + 1;
            System.out.println(cont);

        }
        //APARTADO 7 C
        System.out.println(MSG_3);

        cont = -2;
        while (cont < 100) {
            cont = cont + 2;
            System.out.println(cont);
        }
        //APARTADO 7 D
        System.out.println(MSG_2);
        cont = 101;
        while (cont > 0) {
            cont = cont - 1;
            System.out.println(cont);

        }
    }
}
