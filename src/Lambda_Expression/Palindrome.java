package Lambda_Expression;

import java.util.Scanner;

public class Palindrome {
    @FunctionalInterface
    interface Hello {
        public int hi(int a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Hello h = (int a) -> {
            int temp = a;
            int rev = 0;

            while (a > 0) {
                rev = rev * 10 + a % 10;
                a /= 10;
            }

            if (temp == rev) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

            return rev;
        };

        h.hi(n);
    }
}
