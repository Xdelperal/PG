/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cat.institutmvm.sorteo;

import java.util.Scanner;

/**
 *
 * @author delpe
 */

/*  
    Xavier Del Peral Paris
    INS Manuel Vázquez Montalbán
    12/11/22
    Disseny d'Aplicació Web (DAW)
      
 */

 /*Pre: Programa que guarda los datos solicitados con un maximo de 3 intentor 
al introducir los datos*/
public class Sorteo {

    //DECLARACION DE CONSTANTES
    private static final String MSG_1 = "Id?: ";
    private static final String MSG_2 = "Edat?: ";
    private static final String MSG_3 = "Tipo de venta?: \n 0-Venda Lliure \n 1-Pensionista \n 2-Carnet jove \n 3-Soci";
    private static final String TYPE_0 = "Venda Lliure";
    private static final String TYPE_1 = "Pensionista";
    private static final String TYPE_2 = "Carnet Jove";
    private static final String TYPE_3 = "Soci";
    private static final String MSG_4 = "Importe de la compra?: ";
    private static final String MSG_5 = "Telefono de contacto?: ";
    private static final String MSG_6 = "Error introduzca un valor valido ";
    private static final String MSG_7 = "FINALIZACION DEL PROGRAMA POR ERROR DE DATOS";
    private static final String MSG_8 = "ID   EDAT   TIPO DE VENTA   IMPORTE   TELEFONO";
    private static final int MIN_ID = 111;
    private static final int MAX_ID = 999;
    private static final int MIN_AGE = 14;
    private static final int MAX_AGE = 120;
    private static final int MIN_IMP = 0;
    private static final int MAX_IMP = 1000;
    private static final int MIN_TLF = 111111111;
    private static final int MAX_TLF = 999999999;

    public static void main(String[] args) {

        int id = 0, edat = 0, tlf = 0, tipo, cont = 0, imp = 0, aux = 0;
        boolean correcte;
        String out = "";

        Scanner scn = new Scanner(System.in);
        do {

            /*DO PARA PEDIR ID Y QUE EL VALOR INTRODUCIDO SEA UN NUMERO ENTERO
                    Y ESTE DENTRO DEL RANGO ESTABLECIDO*/
            if (cont < 3 && id < MIN_ID || id > MAX_ID) {

                System.out.println(MSG_1);
                correcte = scn.hasNextInt();
                if (correcte) {
                    id = scn.nextInt();

                    if (id < MIN_ID || id > MAX_ID) {
                        System.out.println(MSG_6);
                        id = 0;
                        cont++;
                    }
                } else {
                    scn.next();
                    System.out.println(MSG_6);
                    id = 0;
                    cont++;

                }
                if (cont == 3 && id < MIN_ID || id > MAX_ID) {
                    System.out.println(MSG_7);
                }
            }

        } while (cont < 3 && id < MIN_ID || id > MAX_ID);

        /*AQUI EN CASO DE CONTADOR SEA 3 ACABA EL BUCLE CONDICIONAL PARA
            PEDIR UN ID*/
 /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE ENTRAR AL BUCLE DE 
                    PEDIR LA EDAD*/
        if (cont < 3) {
            cont = 0;
            do {

                if (cont < 3 && edat < MIN_AGE || edat > MAX_AGE) {

                    System.out.println(MSG_2);
                    correcte = scn.hasNextInt();
                    if (correcte) {
                        edat = scn.nextInt();

                        if (edat < MIN_AGE || edat > MAX_AGE) {
                            System.out.println(MSG_6);
                            edat = 0;
                            cont++;
                        }
                    } else {
                        scn.next();
                        System.out.println(MSG_6);
                        edat = 0;
                        cont++;
                    }

                    if (cont == 3 && edat < MIN_AGE || edat > MAX_AGE) {
                        System.out.println(MSG_7);
                        edat = 0;
                    }
                }

            } while (cont < 3 && edat < MIN_AGE || edat > MAX_AGE);
            /*AQUI EN CASO DE CONTADOR SEA 3 ACABA EL BUCLE CONDICIONAL PARA
            PEDIR UN EDAT*/

            if (edat != 0) {

                /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE ENTRAR AL BUCLE DE 
                    PEDIR LA EDAD*/
                if (cont < 3) {
                    cont = 0;
                    do {
                        System.out.println(MSG_3);
                        correcte = scn.hasNextInt();
                        if (correcte) {
                            tipo = scn.nextInt();

                            /*SI TODO ESTA BIEN QUE GUARDE LA
                            VARIABLE EDAT Y HAGA EL SWITCH*/
                            switch (tipo) {

                                case 0:
                                    out = TYPE_0;
                                    aux = 1;
                                    break;

                                case 1:
                                    out = TYPE_1;
                                    aux = 1;
                                    break;
                                case 2:
                                    out = TYPE_2;
                                    aux = 1;
                                    break;
                                case 3:
                                    out = TYPE_3;
                                    aux = 1;
                                    break;
                                default:
                                    cont++;
                                    System.out.println(MSG_6);
                                    if (cont == 3) {
                                        System.out.println(MSG_7);
                                    }
                                    ;
                                    break;
                            }
                        }
                    } while (cont < 3 && aux != 1);

                    /* EN CASO DE CONTADOR SEA 3 Y AUX SEA DIFERENTE 
                    ACABA EL BUCLE CONDICIONAL PARA PEDIR LA EL TIPO*/
                }
            }

        }
        // QUE COMPRUEBE EL AUXILIAR Y SI ES CORRECTO QUE HAGA EL BUCLE DEL IMPORTE
        if (aux == 1) {

            cont = 0;

            do {
                /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE ENTRAR AL BUCLE DE 
                    PEDIR EL IMPORTE*/
                if (cont < 3 && imp <= MIN_IMP || imp >= MAX_IMP) {

                    System.out.println(MSG_4);
                    correcte = scn.hasNextInt();
                    if (correcte) {
                        imp = scn.nextInt();

                        if (imp < MIN_IMP || imp > MAX_IMP) {
                            System.out.println(MSG_6);
                            imp = -1;
                            cont++;
                        }
                    } else {
                        scn.next();
                        System.out.println(MSG_6);
                        imp = -1;
                        cont++;

                    }

                    if (cont == 3 && imp < MIN_IMP || imp > MAX_IMP) {
                        System.out.println(MSG_7);
                    }
                }

            } while (cont < 3 && imp < MIN_IMP || imp > MAX_IMP);
            /* EN CASO DE CONTADOR SEA 3 ACABA EL BUCLE 
                CONDICIONAL PARA PEDIR EL IMPORTE*/
        }

        if (cont < 3) {
            /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE
        ENTRAR AL BUCLE DE PEDIR LA EDAD*/
            do {

                if (cont < 3 && tlf < MIN_TLF || tlf > MAX_TLF) {

                    System.out.println(MSG_5);
                    correcte = scn.hasNextInt();
                    if (correcte) {
                        tlf = scn.nextInt();

                        if (tlf < MIN_TLF || tlf > MAX_TLF) {
                            System.out.println(MSG_6);
                            tlf = 0;
                            cont++;
                        }
                    } else {
                        scn.next();
                        System.out.println(MSG_6);
                        tlf = 0;
                        cont++;

                    }
                    if (cont == 3 && tlf < MIN_TLF || tlf > MAX_TLF) {
                        System.out.println(MSG_7);
                    }
                }

            } while (cont < 3 && tlf < MIN_TLF || tlf > MAX_TLF);

            if (cont < 3) {
                //ESTAS DOS LINEAS SIRVEN PARA PRINTAR LOS RESULTADOS DE LAS VARIABLES
                System.out.println("\n" + MSG_8);
                System.out.println(id + "   " + edat + "    " + out + "      " + imp + "      " + tlf);

            }
            //
        }
    }

}
//Post: El programa muestra los datos que ha ido almacenando en orden
