package String_QS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Of_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray() ){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
