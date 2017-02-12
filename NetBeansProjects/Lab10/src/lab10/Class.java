/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author mgardin2
 */
public class lab10 {

public static void main(String[] args){

    String string = "sashimi";

    int count = 0;
    for(int i =0; i < string.length(); i++){
        if(string.charAt(i) == 'i'){
            count++;
            }
    }

    System.out.println("The number of letter i is " + count);

} 
}
