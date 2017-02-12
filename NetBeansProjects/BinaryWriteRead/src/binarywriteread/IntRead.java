/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarywriteread;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mgardin2
 */
public class IntRead {
    
    public static void main(String args[]) throws FileNotFoundException {
     
        File file = null;
        int int_data = 0;
        int biggest = 0;
        int total = 0;
        int counter = 0;
        int smallest = 0;
        
        
        if (args.length > 0) file = new File(args[0]);
        if (file == null) {
            System.out.println("Default: integerwrite.dat");
            file = new File("find2016.bin");
           
        }
      
                     
        try {
            FileInputStream file_input = new FileInputStream(file);
            DataInputStream data_in = new DataInputStream(file_input);
            
                while (true) {
                    try {
                        int_data = data_in.readInt();
                        if (int_data > biggest){
                            biggest = int_data;
                        }
                        if (int_data < smallest){
                            smallest = int_data;
                            
                        }
                        total+=int_data;
                        counter++;
                        
                    }
                    catch(EOFException eof) {
                        System.out.println("End of File");
                        break;
                    }
                    
                    System.out.printf("%3d. Data %n", int_data);
                
                }
                
                //System.out.println("Biggest number = " + biggest);
                //System.out.println("Smallest number = " + smallest);
                //int average = total/counter; 
                //System.out.println("Average = " + average);
                
            data_in.close();
            }       
        catch(IOException e) {
            System.out.println("IO Exception =: " + e);
        }
        
    }
   
}


