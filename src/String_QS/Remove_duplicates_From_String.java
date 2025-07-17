package String_QS;

import java.util.Scanner;

public class Remove_duplicates_From_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for (int  i=0;i<s.length();i++){
            if(!result.contains(String.valueOf(s.charAt(i)))){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
