package Codeforces;

import java.util.*;

public class Sorted_differences_of_neighboring {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            Integer[]arr=new Integer[n];
            for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
            Arrays.sort(arr);
            if (n%2!=0) System.out.print(arr[n/2]+" ");
            for (int i = n/2-1; i >=0 ; i--) {
                System.out.print(arr[n-1-i]+" "+arr[i]+" ");
            }
            System.out.println();
        }
    }
}
