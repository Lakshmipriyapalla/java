package String_QS;

import java.util.Scanner;

public class String_rev_using_StringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
           sb.append(str.charAt(i)) ;
        }
        System.out.println(sb.reverse());
    }
}
