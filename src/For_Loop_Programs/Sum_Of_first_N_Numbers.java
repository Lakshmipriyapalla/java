package For_Loop_Programs;

import java.util.Scanner;

public class Sum_Of_first_N_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
