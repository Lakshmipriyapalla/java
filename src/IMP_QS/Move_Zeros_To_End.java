package IMP_QS;

import java.util.Scanner;

public class Move_Zeros_To_End {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
       int count=0;
       for(int i=0;i< arr.length;i++){
           arr[i]=sc.nextInt();
       }
       for(int j=0;j< arr.length;j++){
           if(arr[j]!=0){
               arr[count]=arr[j];
               count++;
           }
       }
       for(int i=count;i<arr.length;i++){
           arr[i]=0;
       }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
