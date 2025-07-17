package String_QS;

import java.util.Scanner;

public class String_Alphabetics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String rev="";
        rev=s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length()).toLowerCase()+s2.substring(0,1).toUpperCase()+s2.substring(1,s2.length()).toLowerCase();
        System.out.println(rev);
    }
}
