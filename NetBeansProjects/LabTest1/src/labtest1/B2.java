/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mgardin2
 */
public class B2 {
    
    public static void main(String args[]) {
        //... Create File objects.
        File source = new File("source.txt");       // set up file to read from
        File destination = new File("destination.txt");  // set up file to write into
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(source));         // Stream to read from source file
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));    // Stream to write to the destination file
            //... Loop as long as there are input lines.
            
            String line = reader.readLine();    //read first line from source file
            
            while (line != null) {//continue until all lines have been read
                
                if(line.matches("[A-Z][a-z]*")) {
                    writer.write(line);             //write the text into the destination file
                    writer.newLine();               //start a new line in the destination file
                    line = reader.readLine();   
                }
                
                else {
                     line = reader.readLine();
                }
                       //read next line from source file
            }
            //... Close reader and writer.
            reader.close();  // Close to unlock.
            writer.close();  // Close to unlock and flush to disk.
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        
    
   }
}


