package For_Loop_Programs;

import java.util.Scanner;

public class Print_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i+=2){
            System.out.print(i+" ");
        }
    }
}
