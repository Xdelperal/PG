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
    private static final String MSG_1 = "Id usuario ";
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
    private static final String MSG_8 = "ID\tEDAT\tTIPO DE VENTA\tIMPORTE\tTELEFONO";
    private static final String MSG_9 = "Introduce la cantidad de valores que quieres almacenar";
    private static final String MSG_11 = "Vols consultar per tipus de client?(si: 1/ no:0)";
    private static final String MSG_11_1 = "Quieres un resumen estadistico? (si: 1/ no:0)";
    private static final String MSG_11_2 = "Quieres continuar? (si: 1/ no:0)";
    private static final String MSG_12 = "Saliendo del programa...";
    private static final String MSG_13 = "Quin tipus de client?";
    private static final String MSG_14 = "ESTOS SON LOS USUARIOS QUE COINCIDEN CON EL FILTRO";
    private static final String MSG_15 = "Numero de clientes introducidos: ";
    private static final String MSG_16 = "Histograma de clientes por tipos";
    private static final String MSG_17 = "Importe total acumulado: ";
    private static final String MSG_18 = "Numero de clients per tipus";
    private static final String MSG_19 = "NO SE ENCUENTRAN USUARIOS";
    private static final String MSG_20 = "La media de edad es de ";
    private static final int MIN_ID = 111;
    private static final int MAX_ID = 999;
    private static final int MIN_AGE = 14;
    private static final int MAX_AGE = 120;
    private static final int MIN_IMP = 0;
    private static final int MAX_IMP = 1000;
    private static final int MIN_TLF = 111111111;
    private static final int MAX_TLF = 999999999;

    public static void main(String[] args) {
        int id = 0, edat = 0, tlf = 0, tipo, cont = 0, imp = 0, lon = 0, i = 0, user = 1, opc = 0, filt, total = 0, seguiment = 0;
        boolean correcte, salida = false, finaliza = false, exit = false;
        String out = "", msg_0 = "", msg_1 = "", msg_2 = "", msg_3 = "";
        Scanner scn = new Scanner(System.in);
        int[] arrayUser = new int[4];
        int[] UserCheck = new int[4];

        String[] arrayHisto = new String[4];
        arrayHisto[0] = "";
        arrayHisto[1] = "";
        arrayHisto[2] = "";
        arrayHisto[3] = "";

        do {
            System.out.println(MSG_9);
            correcte = scn.hasNextInt();
            if (correcte) {
                lon = scn.nextInt();
                if(lon<=0){
                correcte=!correcte;
            } 
                
            } else {
                scn.next();
                System.out.println(MSG_6);
            }
        } while (!correcte);

        int[] arrayId = new int[lon];
        int[] arrayAge = new int[lon];
        int[] arrayTipo = new int[lon];
        int[] arrayImp = new int[lon];
        int[] arrayTlf = new int[lon];

        do {
            do {
                System.out.println("");
                System.out.println("");
                do {

                    seguiment = 0;
                    /*DO PARA PEDIR ID Y QUE EL VALOR INTRODUCIDO SEA UN NUMERO ENTERO
                    Y ESTE DENTRO DEL RANGO ESTABLECIDO*/
                    System.out.println(MSG_1 + user);
                    id = 0;
                    if (cont < 3 && id < MIN_ID || id > MAX_ID) {
                        correcte = scn.hasNextInt();

                        if (correcte) {
                            id = 0;
                            id = scn.nextInt();
                            arrayId[i] = id;
                            
                          if (id < MIN_ID || id > MAX_ID) {
                            System.out.println(MSG_6);
                            id = 0;
                            cont++;
                        }
                    } else {
                        scn.next();
                        System.out.println(MSG_6);
                        id = 0;
                    }
                        }
                       

                    if (cont == 3) {
                        System.out.println(MSG_11_2);
                        do {
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                seguiment = scn.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    finaliza = true;
                                    
                                    if (cont == 3 && seguiment == 0) {
                                     finaliza = true; 
                                    }
                                    
                                    else if(seguiment == 1) {
                                    cont = 0;
                                    }
                                    
                                } else {
                                    System.out.println(MSG_7);
                                }
                            } else {
                                scn.next();
                                System.out.println(MSG_6);
                            }
                        } while (!correcte && exit != true);
                    }
                    

                } while (cont < 3 && id < MIN_ID || id > MAX_ID && exit == false);
                /*AQUI EN CASO DE CONTADOR SEA 3 ACABA EL BUCLE CONDICIONAL PARA
            PEDIR UN ID*/
 /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE ENTRAR AL BUCLE DE 
                    PEDIR LA EDAD*/
                if (cont < 3) {

                    do {

                        seguiment = 0;
                        edat = 0;

                        if (cont < 3 && edat < MIN_AGE || edat > MAX_AGE) {
                            System.out.println(MSG_2);
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                edat = scn.nextInt();
                                arrayAge[i] = edat;
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                

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

                            if (cont == 3) {
                        System.out.println(MSG_11_2);
                        do {
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                seguiment = scn.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    finaliza = true;
                                    
                                    if (cont == 3 && seguiment == 0) {
                                     finaliza = true; 
                                    }
                                    
                                    else if(seguiment == 1) {
                                    cont = 0;
                                    }
                                    
                                } else {
                                    System.out.println(MSG_7);
                                }
                            } else {
                                scn.next();
                                System.out.println(MSG_6);
                            }
                        } while (!correcte && exit != true);
                    }

                        }

                    } while (cont < 3 && edat < MIN_AGE || edat > MAX_AGE);
                    /*AQUI EN CASO DE CONTADOR SEA 3 ACABA EL BUCLE CONDICIONAL PARA
            PEDIR UN EDAT*/
                    if (edat != 0) {
                        /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE ENTRAR AL BUCLE DE 
                    PEDIR LA EDAD*/
                        if (cont < 3) {

                            tipo = 0;
                            salida = false;
                            do {
                                seguiment = 0;

                                System.out.println(MSG_3);
                                correcte = scn.hasNextInt();
                                if (correcte) {
                                    tipo = scn.nextInt();
                                    switch (tipo) {
                                        case 0:
                                            out = TYPE_0;
                                            arrayTipo[i] = tipo;
                                            salida = true;

                                            break;
                                        case 1:

                                            out = TYPE_1;
                                            arrayTipo[i] = tipo;
                                            salida = true;
                                            break;
                                        case 2:

                                            out = TYPE_2;
                                            arrayTipo[i] = tipo;
                                            salida = true;
                                            break;
                                        case 3:

                                            out = TYPE_3;
                                            arrayTipo[i] = tipo;
                                            salida = true;
                                            break;
                                        default:
                                            cont++;
                                            System.out.println(MSG_6);
                                            break;
                                    }
                                } else {
                                    scn.next();
                                    System.out.println(MSG_6);
                                    cont++;
                                }

                                if (cont == 3) {
                        System.out.println(MSG_11_2);
                        do {
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                seguiment = scn.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    finaliza = true;
                                    
                                    if (cont == 3 && seguiment == 0) {
                                     finaliza = true; 
                                    }
                                    
                                    else if(seguiment == 1) {
                                    cont = 0;
                                    }
                                    
                                } else {
                                    System.out.println(MSG_7);
                                }
                            } else {
                                scn.next();
                                System.out.println(MSG_6);
                            }
                        } while (!correcte && exit != true);
                    }
       
                                
                            } while (salida != true);

                            /* EN CASO DE CONTADOR SEA 3 Y AUX SEA DIFERENTE 
                    ACABA EL BUCLE CONDICIONAL PARA PEDIR LA EL TIPO*/
                        }
                    }
                }

                // QUE COMPRUEBE EL AUXILIAR Y SI ES CORRECTO QUE HAGA EL BUCLE DEL IMPORTE
                if (cont < 3 && salida == true) {

                    do {

                        seguiment = 0;
                        /*AQUI VERIFICA QUE SI CONTADOR ES MENOR A 3 PUEDE ENTRAR AL BUCLE DE 
                    PEDIR EL IMPORTE*/
                        imp = 0;
                        if (cont < 3 && imp <= MIN_IMP || imp >= MAX_IMP) {
                            System.out.println(MSG_4);
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                imp = scn.nextInt();
                                arrayImp[i] = imp;
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

                          if (cont == 3) {
                        System.out.println(MSG_11_2);
                        do {
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                seguiment = scn.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    finaliza = true;
                                    
                                    if (cont == 3 && seguiment == 0) {
                                     finaliza = true; 
                                    }
                                    
                                    else if(seguiment == 1) {
                                    cont = 0;
                                    }
                                    
                                } else {
                                    System.out.println(MSG_7);
                                }
                            } else {
                                scn.next();
                                System.out.println(MSG_6);
                            }
                        } while (!correcte && exit != true);
                    }

                        }
                    } while (cont < 3 && imp < MIN_IMP || imp > MAX_IMP);
                    /* EN CASO DE CONTADOR SEA 3 ACABA EL BUCLE 
                CONDICIONAL PARA PEDIR EL IMPORTE*/
                }
                if (cont < 3) {
                    do {
                        seguiment = 0;
                        tlf = 0;
                        if (cont < 3 && tlf < MIN_TLF || tlf > MAX_TLF) {
                            System.out.println(MSG_5);
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                tlf = scn.nextInt();
                                arrayTlf[i] = tlf;
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

                            if (cont == 3) {
                        System.out.println(MSG_11_2);
                        do {
                            correcte = scn.hasNextInt();
                            if (correcte) {
                                seguiment = scn.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    finaliza = true;
                                    
                                    if (cont == 3 && seguiment == 0) {
                                     finaliza = true; 
                                    }
                                    
                                    else if(seguiment == 1) {
                                    cont = 0;
                                    }
                                    
                                } else {
                                    System.out.println(MSG_7);
                                }
                            } else {
                                scn.next();
                                System.out.println(MSG_6);
                            }
                        } while (!correcte && exit != true);
                    }

                        }

                    } while (cont < 3 && tlf < MIN_TLF || tlf > MAX_TLF);
                }
                if (cont < 3) {
                    if (user < lon) {
                        user++;
                    }
                    i++;
                }
            } while (i != arrayId.length && cont < 3);

        } while (finaliza = false);

      //  if (cont < 3) {
            //ESTE SWITCH SIRVE PARA PRINTAR LOS RESULTADOS DE LAS VARIABLES
            System.out.println("\n" + MSG_8);
            for (i = arrayId.length - 1; i >= 0; i--) {
                
                   if(arrayId[i]>MIN_ID && arrayId[i]<MAX_ID){

                    for (int j = i - 1; j >= arrayAge.length ; j--) {
                        if (arrayAge[i] > arrayAge[j]) {
                            int canvi = arrayAge[i];
                            arrayAge[i] = arrayAge[j];
                            arrayAge[j] = canvi;
                            canvi = arrayId[i];
                            arrayId[i] = arrayId[j];
                            arrayId[j] = canvi;
                            canvi = arrayTipo[i];
                            arrayTipo[i] = arrayTipo[j];
                            arrayTipo[j] = canvi;
                            canvi = arrayImp[i];
                            arrayImp[i] = arrayImp[j];
                            arrayImp[j] = canvi;
                            canvi = arrayTlf[i];
                            arrayTlf[i] = arrayTlf[j];
                            arrayTlf[j] = canvi;
                        }
                    }
                
                 
                
                System.out.print(arrayId[i] + "\t" + arrayAge[i] + "\t");
                switch (arrayTipo[i]) {
                    case 0:
                        System.out.print(TYPE_0);
                        break;
                    case 1:
                        System.out.print(TYPE_1);
                        break;
                    case 2:
                        System.out.print(TYPE_2);
                        break;
                    case 3:
                        System.out.print(TYPE_3);
                        break;
                }
                System.out.print("\t" + arrayImp[i] + "\t" + arrayTlf[i]);
                System.out.println("");
                
                
                   }
                
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
//AQUI ES PARA PREGUNTAR EL TIPO DE CLIENTE
            //HACER BUCLE QUE EN CASO DE INTRODUCIR UNA LETRA QUE VUELVA A PREGUNTAR

            System.out.println(MSG_11);
            correcte = scn.hasNextInt();
            if (correcte) {
                opc = scn.nextInt();
                switch (opc) {
                    case 0:
                        System.out.println(MSG_12);
                        break;
                    case 1:
                        System.out.println(MSG_13);
                        correcte = scn.hasNextInt();
                        if (correcte) {
                            filt = scn.nextInt();
                            System.out.println(MSG_14);
                            System.out.println("\n" + MSG_8);
                            
                            
                            for (i = arrayId.length - 1; i >= 0; i--) {
                                
                                if(arrayId[i]>MIN_ID || arrayId[i]<MAX_ID){
                                
                                
                                System.out.println("");
                                if (arrayTipo[i] == filt) {

//Printa los resultados del filtro
                                    System.out.print(arrayId[i] + "\t" + arrayAge[i] + "\t");
                                    switch (arrayTipo[i]) {
                                        case 0:
                                            System.out.print(TYPE_0);
                                            break;
                                        case 1:
                                            System.out.print(TYPE_1);
                                            break;
                                        case 2:
                                            System.out.print(TYPE_2);
                                            break;
                                        case 3:
                                            System.out.print(TYPE_3);
                                            break;
                                    }
                                    System.out.print("\t" + arrayImp[i] + "\t\t\t" + arrayTlf[i]);
                                }
                                
                                
                            }
                                
                                
                            }
                        }
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println(MSG_11_1);
                        correcte = scn.hasNextInt();
                        if (correcte) {
                            opc = scn.nextInt();
                            switch (opc) {
                                case 0:
                                    System.out.println(MSG_12);
                                    break;
//En caso de querer el resumen estadistico calcula el total  y almacena la cantida de usuarios de cada tipo
                                case 1:
                                    System.out.println("");
                                    System.out.println(MSG_15 + user);
                                    System.out.println("");

                                    
                                    
                                    
                                             int sum = 0;
                                                 int count = 0;
                                                 for (i = 0; i < arrayAge.length; i++) {
                                                     if (arrayAge[i] > 14 && arrayAge[i]<120) {
                                                         sum += arrayAge[i];
                                                         count++;
                                                     }
                                                 }
                                                  total = sum /count;  


                                        
                                    System.out.println("-----------------------");
                                    System.out.println(MSG_20 + total + " años");
                                    System.out.println("-----------------------");

                                    System.out.println("");
                                    total = 0;
                                    System.out.println("");

                                    for (i = arrayId.length - 1; i >= 0; i--) {
                                        
                                        total += arrayImp[i];
                                    }
                                    System.out.println(MSG_17 + total + "€");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-----------------------");
                                    System.out.println(MSG_18);
                                    System.out.println("-----------------------");

                                    System.out.println("");
                                    System.out.println("");
                                    for (i = arrayId.length - 1; i >= 0; i--) {
                                       

                                    if(arrayId[i]>MIN_ID && arrayId[i]<MAX_ID){
                                        
                                        
                                        switch (arrayTipo[i]) {
                                            case 0:
                                                arrayUser[0] += 1;
                                                UserCheck[0] = 0;
                                                break;
                                            case 1:
                                                arrayUser[1] += 1;
                                                UserCheck[1] = 1;
                                                break;
                                            case 2:
                                                arrayUser[2] += 1;
                                                UserCheck[2] = 2;
                                                break;
                                            case 3:
                                                arrayUser[3] += 1;
                                                UserCheck[3] = 3;
                                                break;
                                        }
                                        
                                        
                                    } 
                                        
                                        
                                    }
//Comprueba y printa la cantidad de usuarios y de que tipo son
                                    for (i = arrayUser.length - 1; i >= 0; i--) {
                                        if (arrayUser[i] != 0) {
                                            switch (UserCheck[i]) {
                                                case 0:
                                                    System.out.print(TYPE_0 + ": ");
                                                    System.out.println(arrayUser[0]);
                                                    break;
                                                case 1:
                                                    System.out.print(TYPE_1 + ": ");
                                                    System.out.println(arrayUser[1]);
                                                    break;
                                                case 2:
                                                    System.out.print(TYPE_2 + ": ");
                                                    System.out.println(arrayUser[2]);
                                                    break;
                                                case 3:
                                                    System.out.print(TYPE_3 + ": ");
                                                    System.out.println(arrayUser[3]);
                                                    break;
                                            }
                                        }
                                    }
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-----------------------");
                                    System.out.println(MSG_16);
                                    System.out.println("-----------------------");

                                    System.out.println("");
                                    System.out.println("");

                                    // HISTOGRAMA
                                    for (i = arrayId.length - 1; i >= 0; i--) {
                                        
                                        
                                        
                                        if(arrayId[i]>MIN_ID && arrayId[i]<MAX_ID){
                                        
                                        
                                        
                                        
                                        switch (arrayTipo[i]) {

                                            case 0:
                                                arrayHisto[0] = arrayHisto[0] += "*";
                                                break;

                                            case 1:
                                                arrayHisto[1] = arrayHisto[1] += "*";
                                                break;

                                            case 2:
                                                arrayHisto[2] = arrayHisto[2] += "*";
                                                break;

                                            case 3:
                                                arrayHisto[3] = arrayHisto[3] += "*";
                                                break;

                                        }
                                        
                                        
                                    }

                                    }

                                    for (i = arrayUser.length - 1; i >= 0; i--) {
                                        if (arrayUser[i] != 0) {

                                            switch (UserCheck[i]) {

                                                case 0:
                                                    System.out.print(TYPE_0 + ": ");
                                                    System.out.println(arrayHisto[0]);
                                                    break;

                                                case 1:
                                                    System.out.print(TYPE_1 + ": ");
                                                    System.out.println(arrayHisto[1]);
                                                    break;

                                                case 2:
                                                    System.out.print(TYPE_2 + ": ");
                                                    System.out.println(arrayHisto[2]);
                                                    break;

                                                case 3:
                                                    System.out.print(TYPE_3 + ": ");
                                                    System.out.println(arrayHisto[3]);
                                                    break;

                                                default:
                                                    System.out.println("");
                                                    System.out.println(MSG_19);

                                            }

                                        }

                                    }

                            }
                        }
                }
            }
        //}
        
    }
}
//Post: El programa muestra los datos que ha ido almacenando en orden



