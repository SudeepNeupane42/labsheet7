
package labsheet7;

public class Question2 {
    public static void main(String[] args) {
        String str="Java is intresting";
        char[] arr=str.toCharArray();
        System.out.println("the array elements are: ");
        for(char i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nreverse of string is: ");
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
