
package labsheet7;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Question6 {
    public static void main(String[] args) {
        
        try {
            InputStream is=new FileInputStream("D:\\Sudeep.txt");
            byte[] arr=new byte[100];
            is.read(arr);
            String content=new String(arr);
            System.out.println(content);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
 
}
}
