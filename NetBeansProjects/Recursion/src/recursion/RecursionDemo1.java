/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.*;
/**
 *
 * @author mgardin2
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
         System.out.println("Enter an integer:");
         Scanner keyboard = new Scanner(System.in);;
         int number = keyboard.nextInt();
         System.out.println("The digits in that number are:");
         inWords(number);
         System.out.println();
         System.out.println("If you add 55 to that number, ");
         System.out.println("the digits in the new number are:");
         number = number + 55;
         inWords(number);
         System.out.println();
    }
 
    /**
        Precondition: number >= 0
        Action: The digits in number are written out in words.
    */
    public static void inWords(int number) {
        if (number < 10) // the base case
            System.out.print(Convert.digitWord(number) + " ");
        else { // number has two or more digits
            inWords(number/10);
            System.out.print(Convert.digitWord(number%10) + " ");
        }
    }
}

