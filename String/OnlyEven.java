package String;
import java.util.*;

public class OnlyEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(String s:str.split(" ")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }

        
    }


    
}
