package Lambda_Expression;

import java.util.Scanner;

public class Even_Or_Odd {
    @FunctionalInterface
    interface Hi{
        public  void nums(int a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        Hi h=(int a)->{
            if(num1%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        };
      h.nums(num1);
    }
}
