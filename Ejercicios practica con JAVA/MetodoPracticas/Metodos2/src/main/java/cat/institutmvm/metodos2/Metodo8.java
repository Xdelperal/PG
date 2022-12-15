/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.metodos2;

/**
 *
 * @author delpe
 */
import java.util.Scanner; 

public class Metodo8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Introduce la base"); 
    double base = scanner.nextDouble(); 

    System.out.print("Introduce un exponente"); 
    double exponent = scanner.nextDouble();
    double result = Math.pow(base, exponent); 

    System.out.println("The result is: " + result); 
  }
}