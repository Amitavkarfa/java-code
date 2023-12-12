package Array;
import java.util.*;

public class DeleteAElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int a= sc.nextInt();

        int arr[]= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("enter the value yu want to delete");
        int b=sc.nextInt();
        sc.close();

        int arr2[]= new int[arr.length-1];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=b){
                arr2[index]=arr[i];
                index++;
            }

        }
        for(int i=0;i<=arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    
}
