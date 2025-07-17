package IMP_QS;

import java.util.Scanner;

public class Arm_Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        String s=String.valueOf(n);
        int count=s.length();
        while(n>0){
            sum+=Math.pow(n%10,count);
            n/=10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
