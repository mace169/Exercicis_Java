/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _11_Activitats_4_Bucles_Encaixats;

/**
 *
 * @author InePC
 */
public class Activitat_15 {
    public static void main(String[] args) {
        
        //Primer exercici
        for (int i=1; i<=8; i++)
        {
            for (int y=1; y<=9; y++)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Segon exercici
        for (int i=1; i<=9; i++)
        {
            for (int y=1; y<=i; y++)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Tercer exercici
        for (int i=1; i<=9; i++)
        {
            for (int y=1; y<=i; y++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Quart exercici
        int e=1;
        for (int i=1; i<=9; i++)
        {
            for (int y=1; y<=9; y++)
            {
                if (e==y)
                {
                    System.out.print("E ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
            e++;
        }
        System.out.println();
        
        //Cinquè exercici
        for (int i=1; i<=9; i++)
        {
            for (int y=9; y>=i; y--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
