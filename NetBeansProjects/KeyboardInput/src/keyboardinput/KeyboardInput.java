/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardinput;

/**
 *
 * @author mgardin2
 */
import java.io.*;



/** try-catch demo: display the content of a file */
public class KeyboardInput {
    
    public static void main(String[] args) {

        String filename = args[0];

        try {

             FileReader fr = new FileReader(filename);

             BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

                while (line!=null) {

                 System.out.println(line);

                  line = br.readLine();

                }

             } catch(IOException e) {System.out.print("\n\n"+e+"\n\n");}

        }

    }
  
    
