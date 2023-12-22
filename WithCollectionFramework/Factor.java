package WithCollectionFramework;
import java.util.*;

public class Factor {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    sc.close();
    List factors= new ArrayList<>();
  

    for(int i=1;i<a;i++){
        if(a%i==0){
          factors.add(i);
        }
    }
    System.out.println(factors);
}}

    

