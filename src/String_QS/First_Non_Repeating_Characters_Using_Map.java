package String_QS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Characters_Using_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
         Map<Character, Integer> map = new HashMap<>();
         for (char ch : name.toCharArray()) {
             if(map.containsKey(ch)){
                 map.put(ch,map.getOrDefault(ch,0)+1);
             }
             else{
                 map.put(ch,1);
             }
        }
         for(char ch:map.keySet()){
             if(map.get(ch)==1){
                 System.out.println(ch);
                 return;
             }
         }
    }
}

