package EXAM;
import java.util.Arrays;
import java.util.Scanner;
public class Sort_Array_in_Descending_Order_Using_Lambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,(a,b) -> b-a);
       // System.out.println(Arrays.toString(arr));
        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }
}
