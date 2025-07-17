package EXAM;

import java.util.Scanner;

// input-> Let's take LeetCode contest
// output->s'teL ekat edoCteeL tsetnoc

public class Reverse_Words_In_a_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String names[]=s.split(" ");
        for(String words:names){
            StringBuilder sb=new StringBuilder(words);
            System.out.print(sb.reverse()+" ");
        }
    }
}
