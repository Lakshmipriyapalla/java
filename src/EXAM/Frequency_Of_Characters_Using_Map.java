package EXAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Of_Characters_Using_Map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer>m1=new HashMap<>();
          for(char ch:s.toCharArray()){
              m1.put(ch,m1.getOrDefault(ch,0)+1);
          }
        System.out.println(m1);
    }
}
