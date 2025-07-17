package IMP_QS;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(" not Prime");
            return;
        }
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    }
}
/*
if(n==2 || n==3){
            System.out.println(n);
          return;
        }
        if(n%2==0  || n%3==0){
            System.out.println(" not prime");
            return;
        }
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                System.out.println(n);
                return;
            }
        }
        System.out.println(n);
 */


