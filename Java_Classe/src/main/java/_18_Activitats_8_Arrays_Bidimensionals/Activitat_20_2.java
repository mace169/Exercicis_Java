/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _18_Activitats_8_Arrays_Bidimensionals;

import java.util.Random;

/**
 *
 * @author alumnet
 */
public class Activitat_20_2 {
    public static void main(String[] args) {
        
        //Variables
        Random random = new Random ();
        int [][] a = new int [4][5];
        int suma = 0;
        
        //Instruccions
        //Introducció de valors a l'array
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = random.nextInt(100)+1;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(""); 
        }
        //Suma dels valors dins de les columnes senars
            
        for (int i = 0; i < a.length; i++)
        {
            suma += a[i][0];
            suma += a[i][2];
            suma += a[i][4];
        }
        System.out.println("\nLa suma dels valors de les columnes senars es: " +suma);
    }
}
