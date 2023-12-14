package String;
import java.util.*;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pali="";
        String original=sc.next();
        sc.close();
        for(int i=original.length()-1;i>=0;i--){
            pali=pali+original.charAt(i);
        }

    if(original.equals(pali)){
        System.out.println("palindrom");
    }

    else{
        System.out.println("not palidrom");
    }
        
    }
    
    
}
