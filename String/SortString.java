package String;
import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        char ch[]= str.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

        //print string by using string object

        String str2= new String(ch);
        System.out.println(str2);
    }
    
}
