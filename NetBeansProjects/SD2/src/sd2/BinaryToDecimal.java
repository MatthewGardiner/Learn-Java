package sd2;

/**
 *
 * @author mgardin2
 */
import java.util.Scanner;


public class BinaryToDecimal {
    public int powers = 0; 
    public long total;

    public static void main (String[] args) {
      System.out.println("Please enter a binary number: ");
      BinaryToDecimal demo = new BinaryToDecimal();
      String input = demo.getInput();
      long t = demo.converter(input);
      System.out.println("Decimal : " + t);
             
    }
    
    public String getInput() { 
        Scanner input = new Scanner (System.in);
        String b = input.next();
        return b;
    }    
    public long converter(String input){
        for (int i = input.length()-1; i >= 0; i--) {
            if (input.charAt(i) == '1') {
                total = total + (long)Math.pow(2, powers);
            }
            
            else {
            }
            powers++;
        }
        return total; 
    }
}

