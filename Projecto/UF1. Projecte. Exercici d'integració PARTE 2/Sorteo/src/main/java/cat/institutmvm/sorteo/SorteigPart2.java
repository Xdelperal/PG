/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.sorteo;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
Pre: Emmagatzarem dades per fer un projecte amb un màxim de 3 errors i es preguntara si vols seguir.
Despres s'aura de printar els resultats i si vols seleccionar el tipus. També podras fer una mitjana de les dades.
 */
public class SorteigPart2 {

    private static final String MSG_1 = "Introdueix el ID: ";
    private static final String MSG_2 = "\nIntrodueix la teva edat: ";
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)\n";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat.";
    private static final String MSG_8 = "ID\tEDAT\tTIPUS\tIMPORT\tTELÈFON";
    private static final String MSG_9 = "Continuem amb el seguent registre";
    private static final String MSG_10 = "Vols consultar per tipus de client? (si: 1/ no:0) ";
    private static final String MSG_11 = "Quin tipus de client? ";
    private static final String MSG_12 = "Dades de clients de tipus ";
    private static final String MSG_13 = "\nErrors complerts" + "\nVols introdïr un nou registre? (si: 1/ no:0)";
    private static final String MSG_14 = "Error, introduiex els valors 1 o 0";
    private static final String MSG_15 = "Error, introduiex valors del 0 al 3";
    private static final String MSG_16 = "Vols veure un resum estadístic de les dades? (si: 1/ no:0) ";
    private static final String MSG_17 = "Número de clients introduïts: ";
    private static final String MSG_18 = "Mitjana d’edat: ";
    private static final String MSG_19 = "Número de clients per tipus: ";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat" + "\nIntrodueix el número de clients:";
    private static final String MSG_21 = "Histograma de número de clients per tipus: ";
    private static final String MSG_22 = "No hi han registres per mostrar.";
    private static final String MSG_23 = "Import total acumulat: ";
    private static final String MSG_24 = "Error, introduiex la quantitat de clients: ";
    private static final int MAXID = 999;
    private static final int MINID = 111;
    private static final int MAXEDAT = 120;
    private static final int MINEDAT = 14;
    private static final int MAXCOMPRA = 1000;
    private static final int MINCOMPRA = 0;
    private static final int MAXTLF = 999999999;
    private static final int MINTLF = 111111111;
    private static final int TLF = 9;
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        int res = 0, size = 0, numpersona = 0, resum = 0;
        int j = 0, consultaclient = 0, seguiment = 0, finalitza = 0;
        int lliure = 0, pensio = 0, jove = 0, soci = 0, okey = 0;
        double mitjana = 0, total = 0;
        boolean valorCorrecte = false, exit = false;
        boolean l = false, p = false, c = false, s = false;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_20);
        do { //Comencem comprovant el número de registres i si es númeric.
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                size = sc.nextInt();
                if (size >= 1) {
                    exit = true;
                } else {
                    System.out.println(MSG_24);
                }
            } else {
                sc.next();
                System.out.println(MSG_24);
            }
        } while (exit != true);

        int[] arrayId = new int[size];
        int[] arrayEdat = new int[size];
        int[] arrayTipus = new int[size];
        int[] arrayImport = new int[size];
        int[] arrayTelefon = new int[size];
        int[] arrayTlf = new int[size];

        do { //Fem un do while perque solament finalitzi si ho demanem per el programa o arriba a la quantitat demanada de clients.
            for (int i = 0; i < size; i++) {
                exit = false;
                seguiment = 3;
                System.out.println(MSG_1);
                j = 0;
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        arrayId[i] = sc.nextInt();
                        if (arrayId[i] <= MAXID && arrayId[i] >= MINID) {
                            exit = true;
                        } else {
                            System.out.println(MSG_6);
                            j++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_6);
                        j++;
                    }
                    if (j == 3) { //Aquest es el sistema de seguiment, per indicar si vols continuar amb un nou registre
                        System.out.println(MSG_13);
                        do {
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                seguiment = sc.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_14);
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_14);
                            }
                        } while (exit != true);
                    }
                } while (exit != true);
                if (j == 3 && seguiment == 0) { //En el cas de no voler continuar finalitzem el bucle i restem numpersona 1 perque es suma sempre.
                    finalitza = 1;
                    numpersona--;
                }
                if (seguiment == 0) {
                } else {
                    if (seguiment == 1) {
                    } else {
                        seguiment = 3;
                        exit = false;
                        j = 0;
                        System.out.println(MSG_2);
                        do {
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                arrayEdat[i] = sc.nextInt();
                                if (arrayEdat[i] >= MINEDAT && arrayEdat[i] <= MAXEDAT) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_6);
                                    j++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_6);
                                j++;
                            }
                            if (j == 3) {
                                System.out.println(MSG_13);
                                do {
                                    valorCorrecte = sc.hasNextInt();
                                    if (valorCorrecte) {
                                        seguiment = sc.nextInt();
                                        if (seguiment == 1 || seguiment == 0) {
                                            exit = true;
                                        } else {
                                            System.out.println(MSG_14);
                                        }
                                    } else {
                                        sc.next();
                                        System.out.println(MSG_14);
                                    }
                                } while (exit != true);
                            }
                        } while (exit != true);
                        if (j == 3 && seguiment == 0) {
                            finalitza = 1;
                            numpersona--;
                        }
                        if (seguiment == 1) { //Aquí en el cas de que volguem seguir trenquem la cadena per tornar a dalt.
                        } else {
                            if (seguiment == 0) {
                            } else {
                                seguiment = 3;
                                j = 0;
                                exit = false;
                                System.out.println(MSG_3);
                                do {
                                    valorCorrecte = sc.hasNextInt();
                                    if (valorCorrecte) {
                                        arrayTipus[i] = sc.nextInt();
                                        switch (arrayTipus[i]) { //Amb el switch case emmagatzarem el resultat de la variable out.

                                            case 0:
                                                System.out.println("Venda lliure (0)");
                                                exit = true;
                                                break;
                                            case 1:
                                                System.out.println("Pensionista (1)");
                                                exit = true;
                                                break;
                                            case 2:
                                                System.out.println("Carnet Jove (2)");
                                                exit = true;
                                                break;
                                            case 3:
                                                System.out.println("Soci (3)");
                                                exit = true;
                                                break;
                                            default:
                                                j++;
                                                System.out.println(MSG_6);
                                                break;
                                        }
                                    } else {
                                        sc.next();
                                        System.out.println(MSG_6);
                                        j++;
                                    }
                                    if (j == 3) {
                                        System.out.println(MSG_13);
                                        do {
                                            valorCorrecte = sc.hasNextInt();
                                            if (valorCorrecte) {
                                                seguiment = sc.nextInt();
                                                if (seguiment == 1 || seguiment == 0) {
                                                    exit = true;
                                                } else {
                                                    System.out.println(MSG_14);
                                                }
                                            } else {
                                                sc.next();
                                                System.out.println(MSG_14);
                                            }
                                        } while (exit != true);
                                    }
                                } while (exit != true);
                                if (j == 3 && seguiment == 0) {
                                    finalitza = 1;
                                    numpersona--;
                                }
                                if (seguiment == 1) {
                                } else {
                                    if (seguiment == 0) {
                                    } else {
                                        seguiment = 3;
                                        j = 0;
                                        exit = false;
                                        System.out.println("\n" + MSG_4);
                                        do {
                                            valorCorrecte = sc.hasNextInt();
                                            if (valorCorrecte) {
                                                arrayImport[i] = sc.nextInt();
                                                if (arrayImport[i] >= MINCOMPRA && arrayImport[i] <= MAXCOMPRA) {
                                                    exit = true;
                                                } else {
                                                    System.out.println(MSG_6);
                                                    j++;
                                                }
                                            } else {
                                                sc.next();
                                                System.out.println(MSG_6);
                                                j++;
                                            }
                                            if (j == 3) {
                                                System.out.println(MSG_13);
                                                do {
                                                    valorCorrecte = sc.hasNextInt();
                                                    if (valorCorrecte) {
                                                        seguiment = sc.nextInt();
                                                        if (seguiment == 1 || seguiment == 0) {
                                                            exit = true;
                                                        } else {
                                                            System.out.println(MSG_14);
                                                        }
                                                    } else {
                                                        sc.next();
                                                        System.out.println(MSG_14);
                                                    }
                                                } while (exit != true);
                                            }
                                        } while (exit != true);
                                        if (j == 3 && seguiment == 0) {
                                            finalitza = 1;
                                            numpersona--;
                                        }
                                        if (seguiment == 1) {
                                        } else {
                                            if (seguiment == 0) {
                                            } else {
                                                seguiment = 3;
                                                j = 0;
                                                System.out.println("\n" + MSG_5);
                                                exit = false;
                                                do { //Repetim amb la mateix estructura les altres variables, amb un while més. 
                                                    res = 0;
                                                    valorCorrecte = sc.hasNextInt();
                                                    if (valorCorrecte) {
                                                        arrayTelefon[i] = sc.nextInt();
                                                        arrayTlf[i] = arrayTlf[i] + arrayTelefon[i];
                                                        while (arrayTelefon[i] != 0) { //Aquí verificarem el número de xifres que te el valor.   
                                                            arrayTelefon[i] = (arrayTelefon[i] / 10); //Dividem entre 10 per saber el número de xifres.
                                                            res = res + 1;
                                                        }
                                                        if (res == TLF) { //Si el número de xifres es 9, s'emmagatzera.
                                                            exit = true;
                                                        } else {
                                                            System.out.println(MSG_6);
                                                            j++;
                                                        }
                                                    } else {
                                                        sc.next();
                                                        System.out.println(MSG_6);
                                                        j++;
                                                    }
                                                    if (j == 3) {
                                                        System.out.println(MSG_13);
                                                        do {
                                                            valorCorrecte = sc.hasNextInt();
                                                            if (valorCorrecte) {
                                                                seguiment = sc.nextInt();
                                                                if (seguiment == 1 || seguiment == 0) {
                                                                    exit = true;
                                                                } else {
                                                                    System.out.println(MSG_14);
                                                                }
                                                            } else {
                                                                sc.next();
                                                                System.out.println(MSG_14);
                                                            }
                                                        } while (exit != true);
                                                    }
                                                } while (exit != true);
                                                if (j == 3 && seguiment == 0) {
                                                    finalitza = 1;
                                                    numpersona--;
                                                }
                                                if (seguiment == 1) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (seguiment == 1 && size == 1) { //Si volem seguir i size es 1 printem per continuar.
                    System.out.println("\n" + MSG_9);
                } else {
                    numpersona++;
                    if (numpersona < size && finalitza == 0) { //Aquí comprovem si el numpersona es mes petit que size per continuar.
                        System.out.println("\n" + MSG_9);
                    }
                }
                if (j == 3) { // Aquí restem i numpersona, per poder seguir amb el mateix registre i no el seguent.
                    if (i != 0 && finalitza == 0) {
                        i--;
                        numpersona--;
                    }
                }
                if (finalitza == 1) { //Trenquem el bucle for perque volem finalitza.
                    i = 100;
                }
            }
            if (numpersona == size) { // si arribem al maxim de personas que pot tenir el size, finalitza.
                finalitza = 1;
            }
        } while (finalitza == 0);
        if (seguiment == 0 && size == 1) {
        } else { // Aquí mostrarem les dades tenint en compte si les dades han siguit introduides correctament.
            System.out.println("\nA continuació mostrem les dades:");
            System.out.println("\n" + MSG_8);
            for (int i = 0; i < size; i++) {
                if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                    System.out.print(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + ANSI_BLUE);
                    switch (arrayTipus[i]) { //En aquet switch emmagatzarem les vegades d'un tipus que hi ha i si existeix emmagatzemat.

                        case 0:
                            System.out.print(ANSI_BLUE + "Lliure" + ANSI_BLUE);
                            lliure++;
                            l = true;
                            break;
                        case 1:
                            System.out.print(ANSI_BLUE + "Pensio" + ANSI_BLUE);
                            pensio++;
                            p = true;
                            break;
                        case 2:
                            System.out.print(ANSI_BLUE + "Jove" + ANSI_BLUE);
                            jove++;
                            c = true;
                            break;
                        case 3:
                            System.out.print(ANSI_BLUE + "Soci" + ANSI_BLUE);
                            soci++;
                            s = true;
                            break;
                    }
                    System.out.print("\t" + ANSI_BLUE + arrayImport[i] + "\t" + arrayTlf[i] + ANSI_BLUE + "\n");
                }
            }
            System.out.println("S'han introduït " + numpersona + " registres de clients.\n"); // printarem la quantitat de clients fent servir la variable numpersona
            System.out.print(MSG_10);
            exit = false;
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    consultaclient = sc.nextInt();
                    if (consultaclient == 1 || consultaclient == 0) { //Comprovem si volem consultar el tipus de client.
                        exit = true;
                    } else {
                        System.out.println(MSG_14);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_14);
                }
            } while (exit != true);
            if (consultaclient == 1) {
                System.out.print(MSG_11);
                exit = false;
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        consultaclient = sc.nextInt();
                        for (int i = 0; i < size; i++) {
                            switch (consultaclient) { //Amb el switch case printarem la consulta client seleccionada.

                                case 0:
                                    System.out.println(MSG_12 + ANSI_BLUE + "Venda Lliure:" + ANSI_BLUE);
                                    exit = true;                                    
                                    break;
                                case 1:
                                    System.out.println(MSG_12 + ANSI_BLUE + "Pensionista:" + ANSI_BLUE);
                                    exit = true;                                    
                                    break;
                                case 2:
                                    System.out.println(MSG_12 + ANSI_BLUE + "Carnet Jove:" + ANSI_BLUE);
                                    exit = true;                                    
                                    break;
                                case 3:
                                    System.out.println(MSG_12 + ANSI_BLUE + "Soci:" + ANSI_BLUE);
                                    exit = true;                                    
                                    break;
                                default:
                                    j++;
                                    System.out.println(MSG_15);
                                    break;
                            }
                            i = 100;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_15);
                    }
                } while (exit != true); //Aquí
                for (int i = 0; i < size - 1; i++) { // Aquí reordenem els valors per edat segun el tipus de client
                    for (int k = i + 1; k < size; k++) { // tenint en compte que cambiarem tots els valors de la i.
                        if (arrayEdat[i] > arrayEdat[k]) {
                            int canvi = arrayEdat[i];
                            arrayEdat[i] = arrayEdat[k];
                            arrayEdat[k] = canvi;
                            canvi = arrayId[i];
                            arrayId[i] = arrayId[k];
                            arrayId[k] = canvi;
                            canvi = arrayTipus[i];
                            arrayTipus[i] = arrayTipus[k];
                            arrayTipus[k] = canvi;
                            canvi = arrayImport[i];
                            arrayImport[i] = arrayImport[k];
                            arrayImport[k] = canvi;
                            canvi = arrayTlf[i];
                            arrayTlf[i] = arrayTlf[k];
                            arrayTlf[k] = canvi;
                        }
                    }
                }
                for (int i = 0; i < size; i++) { //Aquí comprobem si el tipus seleccionat esta emmagatzemat o no.
                    if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                        if (arrayTipus[i] == consultaclient) {
                            System.out.println(MSG_8);
                            i = 100;
                            okey = 1;
                        }
                    }
                }
                if (okey == 0) { // En el cas de que no hagi ningun emmagatzemat printarem que no hi han registres.
                    for (int i = 0; i < size; i++) {
                        if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                            if (arrayTipus[i] != consultaclient) {
                                System.out.println(MSG_22);
                                i = 100;
                            }
                        }
                    }
                }
                for (int i = 0; i < size; i++) { //Aquí printarem nomes els tipus seleccionat a la consulta
                    if (arrayTipus[i] == consultaclient) {
                        if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                            switch (arrayTipus[i]) {

                                case 0:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Lliure" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + ANSI_BLUE);
                                    break;
                                case 1:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Pensio" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + ANSI_BLUE);
                                    break;
                                case 2:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Jove" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + ANSI_BLUE);
                                    break;
                                case 3:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Soci" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + ANSI_BLUE);
                                    break;
                            }
                        }
                    }
                }
            }
            exit = false;
            System.out.print("\n" + MSG_16 + "\n"); // Aquí preguntarem si volem fer un resum estadístic
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    resum = sc.nextInt();
                    if (resum == 1 || resum == 0) { //Comprovem si volem fer un resum de totes les dades.
                        exit = true;
                    } else {
                        System.out.println(MSG_14);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_14);
                }
            } while (exit != true);
            if (resum == 1) {
                System.out.println(MSG_17 + size);
                for (int i = 0; i < size; i++) {
                    mitjana = mitjana + arrayEdat[i]; //Fem la mitjana sumant totes les edats i dividint per la quantitat de clients.
                }
                System.out.println(MSG_18 + mitjana / size + " anys");
                System.out.println(MSG_19 + "\n"); // amb el sistema boolea detectem quins dels tipus han sigut emmagatzemat.
                if (l == true) {
                    System.out.println("Lliure: " + lliure);
                }
                if (p == true) {
                    System.out.println("Pensio: " + pensio);
                }
                if (c == true) {
                    System.out.println("Jove: " + jove);
                }
                if (s == true) {
                    System.out.println("Soci: " + soci);
                }
                System.out.println("\n" + MSG_21);
                System.out.println("-----------------------------");
                if (lliure != 0) {
                    System.out.print("Lliure: "); //Printem el histograma fent servir les variables del switch case anterior.
                    for (int i = 0; i < lliure; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (pensio != 0) {
                    System.out.print("Pensio: ");
                    for (int i = 0; i < pensio; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (jove != 0) {
                    System.out.print("Jove: ");
                    for (int i = 0; i < jove; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (soci != 0) {
                    System.out.print("Soci: ");
                    for (int i = 0; i < soci; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 0; i < size; i++) {
                    total = total + arrayImport[i]; //Sumem el import de tots els clients i els dividim per la seva quantitat.
                }
                System.out.println("\n" + MSG_23 + total);
            }
        }
        if (seguiment == 0 && size == 1) {
            System.out.print("\n" + MSG_22); //Aquí es si hem posat un client i no hem volgut continuar. No hi ha registres per mostrar.
        }
        System.out.println("\n" + MSG_7); //Printem que ha finalitzat el programa.
    }
}
/*
Post: Printarem el resultat emmagatzemat. Es tindra en compte les multiples posibilitats d'entrada d'errors.
No es bloquejara en ningun punt. Potser no es optimitzat per lineas, pero no falla en cap punt.
 */