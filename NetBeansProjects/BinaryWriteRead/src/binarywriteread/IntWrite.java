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
/**
 *
 * @author mgardin2
 */
public class IntWrite {
    
    public static void main(String args[]) {
        
        int[] int_data = new int[101];
        
        for (int i=0; i<int_data.length; i++) {
            int_data[i] = i;
            
        }
        
        File file = null;
        
        if (args.length > 0) file = new File(args[0]);
        
            if (file == null) {
                System.out.println("Default: integerwrite.dat");
                file = new File("integerwrite.dat");
            }
        
        try {
            
            FileOutputStream file_output = new FileOutputStream(file);
            
            DataOutputStream data_out = new DataOutputStream(file_output);
        
       
        for (int i=0; i<int_data.length; i++) {
            data_out.writeInt(int_data[i]);
        }
        
        file_output.close();
    
        }
    
        catch(IOException e) {
            System.out.println("IO Exception = " + e);
        }
    }
}

    

