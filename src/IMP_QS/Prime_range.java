package IMP_QS;

import java.util.Scanner;

public class Prime_range {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i==1){
               // System.out.println("not prime");
                System.out.print(" ");
                continue;
            }
            if(i==2 || i==3){
                System.out.print(i+" ");
                continue;
            }
            if(i%2==0  || i%3==0){
                //System.out.println(" not prime");
                System.out.print(" ");
                continue;

            }
            boolean isPrime=true;
            for(int j=5;j*j<=i;j+=6){
                if(j%i==0 || j%(i+2)==0){
                    System.out.print(j);
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+"");
            }
        }

    }
}
