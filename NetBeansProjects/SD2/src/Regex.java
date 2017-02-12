/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mgardin2
 */

import java.util.Scanner;

public class Regex {
    
    public static void main(String args[]) {
        System.out.println("Please enter a Reg");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        boolean result = s.matches("[A-Z]{2}[0-9]{2} [A-Z]{3}");
        
        if (result == false){
            System.out.println("Invalid Reg");
        }
        else {
            System.out.println("Valid Reg");
        }
        
        
    }
}
