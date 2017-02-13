import java.util.*;
import java.io.*;

class DSA_CW {
	
	static int array[] = new int[16]; 
	//array used to store the generated keys
	
    
    public static long mod(long x, long y) {
	/** This function runs the modulo operation on two numbers that
        are given to the function **/    
	    
	    long result = x % y;
	        if (result < 0) {
	        result += y;
	        }
	    return result;
    }

    
    public static long fib(int n) {
    /** This function calculates the fibonacci sequence where n is the
        integer it calculates to, e.g fib(100) **/ 	
    	
    	long a = 0;
    	long b = 1;

		for (int i = 0; i < n; i++) {
		    long temp = a;
		    a = b;
		    b = temp + b;
		}
	    return a;
    }
    	
	public static void keyGen() {
	/** This function generates the keys in the long Datatype to be 
	    inserted into linked list, converts them to integers then inserts
	    them in an integer array **/
	
		long LongKey = 0;
		long result = 0;
	    int k = 1;
		
		for(int i = 0; i <= 15; i++) {
		
			long number = fib(100+k);
			long moddedNum = mod(number, 15006247L);
		    LongKey = mod(moddedNum, 15006247L);
		    int key = (int) LongKey;
			array[i] = key;
			k++;
		}	
	}
    
    public static void main(String args[]) {
		try{
		    keyGen(); //runs the keygen function and generates the keys    
			PrintWriter writer = new PrintWriter("Results.txt", "UTF-8");	
			writer.println("15006247"); //Task 1
		    writer.println("LIST");     //Task 1
		    writer.println("data " + Arrays.toString(array)); //Task 2
		    LinkedList list = new LinkedList(); //Instantiate LinkedList.java
		    writer.println();
		    writer.println("LIST trace");
		    for(int i = 0; i < array.length; i++) {
		        list.sortInsert(array[i]); //Take the contents of the array and sort them in the doubly linked list.
		        writer.println(list.buffer);
		        //Prints the buffer variable, which contains the trace
		    }
		    writer.close();
		} 
		catch (Exception e) {
            System.out.println("Something broke");
    	}
	}
}
    
    
