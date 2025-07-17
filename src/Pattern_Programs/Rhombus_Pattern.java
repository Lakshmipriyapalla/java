package Pattern_Programs;

import java.util.Scanner;

public class Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int m=1;m<=n;m++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
