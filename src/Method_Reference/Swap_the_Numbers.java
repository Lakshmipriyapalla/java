package Method_Reference;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Swap_the_Numbers {
    public void nums(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        BiConsumer<Integer,Integer>bi=new Swap_the_Numbers()::nums;
        bi.accept(a,b);

    }
}
