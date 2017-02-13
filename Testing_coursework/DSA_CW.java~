import java.util.*;
import java.io.*;

class DSA_CW {
	
	static int array[] = new int[16];

    public static long mod(long x, long y) {
	    long result = x % y;
	        if (result < 0) {
	        result += y;
	        }
	    return result;
    }

    public static long fib(int n) {
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
		    keyGen();
		    //System.out.println(Arrays.toString(array));        
			PrintWriter writer = new PrintWriter("DSA_CW.txt", "UTF-8");	
			writer.println("15006247");
		    writer.println("HEAP");
		    writer.println("data " + Arrays.toString(array));
		    writer.close();
		    LinkedList list = new LinkedList();
		    list.LinkedList();
		    for(int i = 0; i < array.length; i++) {
		        list.add(array[i]);
		        System.out.println("Inserted key: " + array[i]);
		        list.moveForward();
		    }
		    System.out.println(list.getData());
		    System.out.println(list.size());
		    
		} 
		catch (Exception e) {
    
    	}
	}
}
    
    
