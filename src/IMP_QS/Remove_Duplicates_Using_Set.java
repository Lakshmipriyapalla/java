package IMP_QS;

import java.util.*;

public class Remove_Duplicates_Using_Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            al.add(sc.nextInt());
        }
        Set<Integer> bl = new HashSet<>(al);
            System.out.println(bl);
    }
}
