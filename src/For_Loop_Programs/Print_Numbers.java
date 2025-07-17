package For_Loop_Programs;

import java.util.Scanner;

public class Print_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }

}
