/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author mgardin2
 */
import java.util.*;
 
public class Recursion {
 
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("The digits in that number are:");
        inWords(number);
        System.out.println();
    }
 
    /**
        Precondition: number >= 0
        Action: The digits in number are written out in words.
    */
    public static void inWords(int number) {
        int divisor = powerOfTen(number);
        int next = number;
        while (divisor >= 10) {
            System.out.print(Convert.digitWord(next/divisor) + " ");
            next = next%divisor;
            divisor = divisor/10;
        }
        System.out.print(Convert.digitWord(next/divisor) + " ");
    }
 
    /**
        Precondition: n >= 0. Returns the number in the form "one
        followed by all zeros" that is the same length as n.
    */
    private static int powerOfTen(int n) {
        int result = 1;
        while (n >= 10) {
           result = result*10;
           n = n/10;
        }
        return result;
    }
 
}
