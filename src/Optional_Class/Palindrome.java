package Optional_Class;

import java.util.Optional;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
            int rev=0;
        Optional<Integer>op=Optional.ofNullable(n);
        if(op.isPresent()){
            while(n>0){
                int digit=n%10;
                rev=rev*10+digit;
                n/=10;
            }
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
