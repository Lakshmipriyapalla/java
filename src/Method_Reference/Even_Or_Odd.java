package Method_Reference;

import java.util.Scanner;
import java.util.function.Function;

public class Even_Or_Odd {
    public int hello(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Function<Integer,Integer>f=new Even_Or_Odd()::hello;
        f.apply(n);

    }
}
