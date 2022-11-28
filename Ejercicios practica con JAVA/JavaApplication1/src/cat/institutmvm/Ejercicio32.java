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
public class Ejercicio32 {
    private static final float IVA4 = 0.04F;
    private static final float IVA8 = 0.08F;
    private static final float IVA21 = 0.21F;
    private static final String MSG_1 = "Introdueix el preu base del producte: ";
    private static final String MSG_2 = "Introdueix el numero de unitats de producte: ";
    private static final String MSG_3 = "Introdueix la categoria: ";
    private static final String MSG_4 = "Categories: \n 1-Medicaments\n 2-Farines\n 3-Medicaments veterinaris\n 4-Aigues\n 5-Cosmetics\n 6-Begudes alcoholiques";
    private static final String MSG_5 = "S'aplica un IVA superreduït (4%)";
    private static final String MSG_6 = "S'aplica un IVA reduït (8%)";
    private static final String MSG_7 = "S'aplica un IVA general (21%)";
    private static final String MSG_8 = "El preu total sense enviament es de: ";
    private static final String MSG_9 = "El cost d'enviament es de: ";
    private static final String MSG_10 = "El preu total amb enviament es de: ";
    private static final String MSG_11 = "Opció no valida";
    
    public static void main(String[] args){
        int base=0, ud=0, cat;
        double total = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                base = sc.nextInt();
            }
            else{
                sc.next();
                System.out.println("Error \n");
            }
        }while(!valorCorrecte);
        
        do{
            System.out.println("\n" + MSG_2);
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                ud = sc.nextInt();
            }
            else{
                sc.next();
                System.out.println("Error \n");
            }
        }while(!valorCorrecte);
        
        System.out.println("\n" + MSG_3 + "\n" + MSG_4 + "\n");
        cat = sc.nextInt();
        while(cat > 6 || cat < 1){
            System.out.println(MSG_11);
            cat = sc.nextInt();
        }
        switch (cat) {
            case 1:
                System.out.println("\n" + MSG_5);
                total = (base * ud * IVA4);
                total = (total + base * ud);
                System.out.println("\n" + MSG_8 + total + "€");
                break;
            case 2:
                System.out.println("\n" + MSG_5);
                total = (base * ud * IVA4);
                total = (total + base * ud);
                System.out.println("\n" + MSG_8 + total + "€");
                break;
            case 3:
                System.out.println("\n" + MSG_6);
                total = (base * ud * IVA8);
                total = (total + base * ud);
                System.out.println("\n" + MSG_8 + total + "€");
                break;
            case 4:
                System.out.println("\n" + MSG_6);
                total = (base * ud * IVA8);
                total = (total + base * ud);
                System.out.println("\n" + MSG_8 + total + "€");
                break;
            case 5:
                System.out.println("\n" + MSG_7);
                total = (base * ud * IVA21);
                total = (total + base * ud);
                System.out.println("\n" + MSG_8 + total + "€");
                break;
            case 6:
                System.out.println("\n" + MSG_7);
                total = (base * ud * IVA21);
                total = (total + base * ud);
                System.out.println("\n" + MSG_8 + total + "€");
                break;
            default:
                System.out.println("\nError opción no valida");
        }
        
        if (cat >= 1 && cat <=6){
            if (total < 100){
                System.out.println("\n" + MSG_9 + "3€");
                System.out.println("\n" + MSG_10 + (total + 3) + "€");
            }
            else if(total > 100 && total <= 500){
                System.out.println("\n" + MSG_9 + "20€");
                System.out.println("\n" + MSG_10 + (total + 20) + "€");
            }
            else{
                System.out.println("\n" + MSG_9 + "50€");
                System.out.println("\n" + MSG_10 + (total + 50) + "€");
            }
        }
    }
}

