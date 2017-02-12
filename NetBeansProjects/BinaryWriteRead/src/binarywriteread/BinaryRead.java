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
import java.io.IOException;

/**
 *
 * @author mgardin2
 */
public class BinaryRead {
      
    public static void main(String arg[]) {
        File file = null;
        int i_data = 0;
        double d_data = 0.0;
 
    
        if (arg.length > 0) file = new File(arg[0]);
        if (file == null) {
        System.out.println("Default: numerical.dat");
        file = new File("integers.bin");
    }
 
    try {
      // Wrap the FileInputStream with a DataInputStream
      FileInputStream file_input = new FileInputStream(file);
      DataInputStream data_in = new DataInputStream(file_input);
 
      while (true) {
        try {
          i_data = data_in.readInt();
          d_data = data_in.readDouble();
        }
        catch(EOFException eof) {
          System.out.println("End of File");
          break;
        }
        // Print out the integer, double data pairs.
        System.out.printf("%3d", i_data);
      }
      data_in.close();
    } catch(IOException e) {
       System.out.println("IO Exception =: " + e);
    }
  } // main
}
