package labsheet7;

import java.io.*;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("D:\\Sudeep2.txt");
            byte[] arr = new byte[100];
            Scanner sc = new Scanner(System.in);
            System.out.println("enter content to write");
            String contentToWrite = sc.nextLine();
            arr = contentToWrite.getBytes();
            os.write(arr);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
