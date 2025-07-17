package EXAM;

import java.util.*;

public class Sum_Of_Unique_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];

      Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int sum=0;
        for (int key : map.keySet()){
            if(map.get(key)==1){
                  sum+=key;
            }
        }
        System.out.println(sum);
    }
}
