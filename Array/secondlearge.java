package Array;
import java.util.*;

public class secondlearge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr []= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
              sc.close();
        }

        Arrays.sort(arr);
        System.out.println("arr after sort");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("second largest element is"+arr[arr.length-2]);
    }
  
    
}
