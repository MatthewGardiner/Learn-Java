/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarywriteread;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author mgardin2
 */
public class BinaryWriteRead {

    
    public static void main(String arg[]) {
        Random ran = new Random();
 
    
        int[] i_data = new int[15];
        double[] d_data = new double[15];
    
        for (int i=0; i<i_data.length; i++) {
            i_data[i] = i;
            d_data[i] = ran.nextDouble() * 10.0;
        }
 
        File file = null;
    
        if (arg.length > 0) file = new File(arg[0]);
    
        if (file == null) {
            System.out.println("Default: numerical.dat");
            file = new File("numerical.dat");
        }
 
    
        try {
    
            FileOutputStream file_output = new FileOutputStream(file);
    
            DataOutputStream data_out = new DataOutputStream(file_output);
        
    
        for (int i=0; i<i_data.length; i++) {
            data_out.writeInt(i_data[i]);
            data_out.writeDouble(d_data[i]);
        }
      
    file_output.close();
    
        }
    catch(IOException e) {
       System.out.println("IO exception = " + e);
    }
  } // main
} // class BinOutputFileApp
    

