package String_QS;

import java.util.Scanner;

public class First_NonRepeating_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String   str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j) && i!=j)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                result+=str.charAt(i);
                 break;
            }
        }
        System.out.println(result);
    }
}
