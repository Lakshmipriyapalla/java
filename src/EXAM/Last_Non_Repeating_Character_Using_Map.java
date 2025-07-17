package EXAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Last_Non_Repeating_Character_Using_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Map<Character, Integer> m1 = new HashMap<>();
    for(char ch:s.toCharArray()){
        if(m1.containsKey(ch)){
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        else{
            m1.put(ch,1);
        }
    }
      Character lastnonrepeat=null;


      char arr[]=s.toCharArray();
      for(int i=s.length()-1;i>=0;i--){
        char ch=arr[i];
        if(m1.get(ch)==1){
            lastnonrepeat=ch;
            break;
        }
    }
        if (lastnonrepeat != null) {
            System.out.println("Last non-repeating character: " + lastnonrepeat);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
  }