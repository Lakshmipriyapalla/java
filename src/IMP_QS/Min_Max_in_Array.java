package IMP_QS;
import java.util.Scanner;
public class Min_Max_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            //System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
