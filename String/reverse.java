package String;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();

        String s2[]= s.split(" ");
        for(int i= s2.length-1;i>=0;i--)
        {
            System.out.print(s2[i]+" i");
        }
        

        

    }


    
}
