package Optional_Class;

import java.util.Optional;
import java.util.Scanner;

public class Swap_the_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Optional<Integer>op=Optional.ofNullable(a);
        Optional<Integer>ob=Optional.ofNullable(b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
