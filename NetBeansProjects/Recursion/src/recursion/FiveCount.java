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
public class FiveCount {
    public static void main(String[] Args) {
        System.out.println("Enter a non-negative number");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(number + " contains " + numberOfFives(number) + " fives");
    }
    public static int numberOfFives(int n) {
        if (n == 5)
            return 1;
        else if (n < 10)
            return 0;
        else if (n%10 == 5)
            return(numberOfFives(n/10) + 1);
        else
            return(numberOfFives(n/10));
    }
}
