/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;
import java.net.*; 
import java.io.*; 
/**
 *
 * @author mgardin2
 */
class ReadURL {
    
    public static void main(String[] args) { 
        try { 
            URL yahoo = new URL("http://www.yahoo.com/"); 
            BufferedReader in = new BufferedReader( 
                new InputStreamReader(yahoo.openStream())); 
            String inputLine; 
    
            while ((inputLine = in.readLine()) != null) { 
                // Process each line.
                System.out.println(inputLine); 
            } 
            in.close(); 
    
        } catch (MalformedURLException me) { 
            System.out.println(me); 
    
        } catch (IOException ioe) { 
            System.out.println(ioe); 
        } 
    }//end main 
}//end class ReadURL
