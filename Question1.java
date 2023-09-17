
package labsheet7;

import javafx.beans.binding.Bindings;


public class Question1 {
    public static void main(String[] args) {
        
        String str1="sudeep neupane";
        String str2=" is a guy";
        System.out.println("string length is: "+str1.length());
        System.out.println("string concat: "+str1.concat(str2));
        System.out.println("two strings are equal? "+str1.equals(str2));
        System.out.println("two string are equal ignoring case? "+str1.equalsIgnoreCase(str2));
        System.out.println("string1 contains neupane? "+str1.contains("neupane"));
        System.out.println("char at index 3 is: "+str1.charAt(3));

    }
}
