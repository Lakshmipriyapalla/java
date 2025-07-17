package String_QS;

import java.util.Scanner;

public class Last_NonRepeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            int count = 0;
            if (s.charAt(i) != ' ') {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
            }
            if (count == 0) {
                result += s.charAt(i);
                break;
            }
        }
        System.out.println(result);
    }
}


        // first Non R-C-Practice
//        String result="";
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=s.length()-1;i>=0;j++){
//                if(s.charAt(i)==s.charAt(j)&& i!=j){
//                    count++;
//                    break;
//                }
//            }
//            if(count==0){
//                result+=s.charAt(i);
//                break;
//            }
//        }
//        System.out.println(result);


