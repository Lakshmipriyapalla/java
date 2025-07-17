package IMP_QS;
import java.util.Scanner;
public class SumAndAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        float f=sum/ arr.length;
        System.out.println(f);
    }
}
