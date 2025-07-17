package Optional_Class;

import java.util.Optional;
import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Optional<Integer>op=Optional.ofNullable(n);
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
