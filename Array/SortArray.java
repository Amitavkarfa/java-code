package Array;
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String temp;
        String [] arr = new String[a];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.next();
            sc.close();
         }
         System.out.println("array before sort is");
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
         }
         for(String s:arr){
            System.out.println(s);
         }

        }
    
}
