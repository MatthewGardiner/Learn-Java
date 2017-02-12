
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author mgardin2
 */


public class B1 {

 
    public static void main(String[] args) {
        File file = null;
        
        file = new File("textout.txt");
        
        try {
            OutputStream out  = new FileOutputStream(file);
            Writer w = new  OutputStreamWriter(out);
            
            for(int i = 0; i<3; i++) {
               w.write("Hello World!");
               w.write("\n");
            }
            
            w.close();
            out.close();
        }    
        
        catch(IOException e) {
            System.out.println("IO Exception " + e);
        }   
      
    }
    
}
