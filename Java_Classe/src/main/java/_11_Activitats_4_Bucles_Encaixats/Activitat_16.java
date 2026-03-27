/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _11_Activitats_4_Bucles_Encaixats;

import java.util.Scanner;

/**
 *
 * @author InePC
 */
public class Activitat_16 {
    public static void main(String[] args) {
        
        //Variables
        Scanner lector = new Scanner (System.in);
        int inici=0, ultim=0; //si no assigno un valor el codi no funciona
        boolean error = true;
        
        //Instruccions
        //Demanem dades
        //Per no fer l'exercici massa llarg, no acceptarem valors més grans de 999
        while (error)
        {
            System.out.println("Introdueix el valor inicial del dividend (inferior a 1000):");
            inici = lector.nextInt();
            System.out.println("Introdueix el valor final del dividend (inferior a 1000:");
            ultim = lector.nextInt();
            if (inici<ultim && (inici<1000 && ultim<1000))
            {
                error=false;
            }
            else
            {
                System.out.println("Error. Valors inicial/final no valids.");
                System.out.println("El valor inicial ha de ser mes petit que el final!");
            }
        }
        
        //Inici bucle dels dividends
        int aux=inici;
        System.out.print("   ");
        while (aux<=ultim)
        {
            System.out.print(aux+" ");
            aux++;
        }
        System.out.println();
        
        //Inici bucle divisors
        for (int i=1; i<=10; i++)
        {
            aux=inici;
            /**
             * Es fan ifs adicionals per afegir espais per a que quadri la taula.
             */
            System.out.print(i+" ");
            if (i<10)
            {
                System.out.print(" ");
            }
            while (aux<=ultim)
            {
                if (aux%i==0)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("-  ");
                }
                if (aux>=100)
                {
                    System.out.print(" ");
                }
                aux++;
            }
            System.out.println();
        }
    }
}
