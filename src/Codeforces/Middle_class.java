package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Middle_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            Integer[] arr = new Integer[n];
            long s= 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                s+=arr[i];
            }
            Arrays.sort(arr);
            int a = 0;
            for (int i = 0; i <n ; i++) {
                if (s/(n-i)>=x){
                    a=n-i;
                    break;
                } else s-=arr[i];
            }
            System.out.println(a);
        }
    }
}
