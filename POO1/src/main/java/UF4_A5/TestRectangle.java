/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF4_A5;

/**
 *
 * @author alumnet
 */
public class TestRectangle {
    public static void main(String[] args) {
     
        Rectangle rectangle1 = new Rectangle(2, 3, 1, 1);
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle3 = new Rectangle(2);
        Rectangle rectangle4 = new Rectangle();
        
        //Imprimim rectangle 1
        System.out.println("\nRectangle1\n----------------------\n" +rectangle1);
        
        //Imprimim rectangle 2
        System.out.println("\nRectangle2\n----------------------\n" +rectangle2);
        
        //Imprimim rectangle 3
        System.out.println("\nRectangle3\n----------------------\n" +rectangle3);
        
        //Imprimim rectangle 4
        System.out.println("\nRectangle4\n----------------------\n" +rectangle4);
        
        //REDIMENSIONAR
        //Imprimim rectangle 1
        rectangle1.redimensionar(2, 1);
        System.out.println("\nRectangle1 redimensionar(2, 1)\n----------------------\n" +rectangle1);
        
        //Imprimim rectangle 2
        rectangle2.redimensionar(0.5, -1);
        System.out.println("\nRectangle2 redimensionar(0.5, -1)\n----------------------\n" +rectangle2);
        
        //Imprimim rectangle 3
        rectangle3.redimensionar(-3.25);
        System.out.println("\nRectangle3 redimensionar(-3.25)\n----------------------\n" +rectangle3);
        
        //Imprimim rectangle 4
        rectangle4.redimensionar();
        System.out.println("\nRectangle4 redimensionar()\n----------------------\n" +rectangle4);
    }
}
