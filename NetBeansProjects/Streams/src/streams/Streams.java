/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
        
public class Streams {
 
    public static void main(String args[]) {
       
        Streams cf = new Streams();
        System.out.println("Please enter a input file.");
        String InFile = cf.getInputFile();
        System.out.println("Please enter an output file.");
        String OutFile = cf.getOutputFile();
        
        
        
        //... Create File objects.
        //File inFile  = new File(args[0]);  // read from first file specified
        //File outFile = new File(args[1]);  // write into second file
 
        //... Enclose in try..catch because of possible io exceptions.
        try {
            //... Create reader and writer for text files.
            BufferedReader reader = new BufferedReader(new FileReader(InFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(OutFile));
 
            //... Loop as long as there are input lines.
            String line = null;
            while ((line=reader.readLine()) != null) {
                if(line.matches("[a-z]*[e][a-z]*")){
                writer.write(line);
                writer.newLine();   // Write system-dependent end of line.
                }
                else {
                    writer.write("Line Ommited");
                    writer.newLine();
                }
            }
 
            //... Close reader and writer.
            reader.close();  // Close to unlock.
            writer.close();  // Close to unlock and flush to disk.
 
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
            
        }
    }
    
    public String getInputFile() {
        Scanner InFile = new Scanner(System.in);
        String a = InFile.next();
        return a;
    }
    public String getOutputFile() {
        Scanner OutFile = new Scanner(System.in);
        String b = OutFile.next();
        return b;
    }

}
