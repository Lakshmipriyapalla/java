package EXAM;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Names_And_Heights_Using_Map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Map<String,Integer>m1=new TreeMap<>();
        for(int i=0;i<=n;i++){
            System.out.println("enter  your name");
            String name=sc.nextLine();
            System.out.println("enter your height");
            int height=sc.nextInt();
            sc.nextLine();
            m1.put(name,height);
            for(Map.Entry<String,Integer>entry:m1.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
