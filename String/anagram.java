package String;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String str1=sc.next();
    String str2= sc.next();
    sc.close();
    System.out.println("two strings are anagram is"+ anagramm(str1, str2));

    
}
public static boolean anagramm(String str1,String str2){
    char [] charstr1= str1.toCharArray();
    char [] charstr2= str2.toCharArray();
    Arrays.sort(charstr1);
    Arrays.sort(charstr2);
    return Arrays.equals(charstr1, charstr2);
}

}
