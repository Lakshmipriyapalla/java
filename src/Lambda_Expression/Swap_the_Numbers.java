package Lambda_Expression;

import java.util.Scanner;

public class Swap_the_Numbers {
    @FunctionalInterface
    interface Hello{
        public void add(int a ,int b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Hello h=(int a,int b)->{
          int temp=a;
          a=b;
          b=temp;
            System.out.println(a);
            System.out.println(b);
        };
        h.add(num1,num2);
    }
}
