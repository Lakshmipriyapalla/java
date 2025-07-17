package IMP_QS;

import java.util.Arrays;
import java.util.Scanner;

public class Removing_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
