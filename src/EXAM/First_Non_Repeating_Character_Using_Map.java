package EXAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Character_Using_Map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer>m1=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(m1.containsKey(ch)){
                m1.put(ch,m1.getOrDefault(ch,0)+1);
            }
           else{
               m1.put(ch,1);
            }
        }
        for(char ch:m1.keySet()){
            if(m1.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
    }
}
