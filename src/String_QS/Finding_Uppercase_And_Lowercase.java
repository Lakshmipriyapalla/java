package String_QS;

import java.util.Scanner;

public class Finding_Uppercase_And_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String smalls = "";
        String capitals = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch>='a' && ch <= 'z') {
                smalls += ch;
            }
            if(ch>='A' && ch<='Z'){
                capitals+=ch;
            }

      }
        System.out.println(smalls);
        System.out.println(capitals);
    }
}
