package labsheet7;

public class Question3 {

    public static void main(String[] args) {
        String str = "JAVA,DSA,SAD,Prob and STAT,Web Tech";
        String[] arr = str.split(",");
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
