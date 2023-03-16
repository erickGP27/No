/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricase;
import java.util.Scanner;
/**
 *
 * @author SAC2-9
 */
public class Datos {
     Scanner input = new Scanner (System.in);
    public static double area; 
    public static double lado; 
    public static double radio; 
    public static double radio2;
    public static double base ; 
    public static double altura ; 
    public static double diametro; 
    
    public void Datos(){
    System.out.println("Ingresa el valor del radio");
    radio = input.nextDouble();
    System.out.println("Ingresa el valor del lado");
    lado = input.nextDouble();
    System.out.println("Ingresa el valor de la base y la altura");
    base = input.nextDouble();
    altura = input.nextDouble();
    System.out.println("Ingresa el valor del lado");
    lado = input.nextDouble();
    System.out.println("Ingresa el valor del radio");
    radio = input.nextDouble();
    System.out.println("Ingresa el valor de");
    base = input.nextDouble();
    }
