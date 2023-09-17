/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet7;

import java.io.*;

/**
 *
 * @author student3
 */
public class Question8 {
    public static void main(String[] args) {
        try {
            byte[] arr=new byte[100];
            InputStream is=new FileInputStream("D:\\Sudeep.txt");
            is.read(arr);
            OutputStream os = new FileOutputStream("D:\\Sudeep2.txt");
            os.write(arr);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
