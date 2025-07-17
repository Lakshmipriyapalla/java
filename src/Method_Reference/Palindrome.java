package Method_Reference;

import java.util.Scanner;
import java.util.function.Consumer;

public class Palindrome {
    public  void drome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Consumer<Integer>c=new Palindrome()::drome;
        c.accept(n);
    }
}
