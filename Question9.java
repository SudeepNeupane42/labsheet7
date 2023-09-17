/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet7;

import java.io.*;

public class Question9 {
    public static void main(String[] args) {
        try {
            byte[] byteArr=new byte[100];
            InputStream is=new FileInputStream("D:\\Sudeep.txt");
            is.read(byteArr);
            String str1=new String(byteArr);
            InputStream is1=new FileInputStream("D:\\Sudeep2.txt");
            is1.read(byteArr);
            String str2=new String(byteArr);
            String finalString=str1+str2;
            byteArr=finalString.getBytes();
            OutputStream os = new FileOutputStream("D:\\Sudeep2.txt");
            os.write(byteArr);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
