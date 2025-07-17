package EXAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Of_Characters_Count_Using_Map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(char ch:s.toCharArray()){
            Map<Character,Integer>map=new HashMap<>();
            map.put(ch,map.getOrDefault(ch,0)+1);
            count++;
        }

        System.out.println(count);
    }
}
