package Codeforces;

import java.util.Objects;
import java.util.Scanner;

public class Pho_Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0,k=0,l1=0,l2=0;
        Integer[][]arr=new Integer[n][2];
        for (int i=0;i<n;i++) {
            String s = sc.next();
            arr[i][0]=s.replace("1","").length();
            arr[i][1]=s.length()-arr[i][0];
            sum+=Math.min(arr[i][0],arr[i][1]);
            if (Objects.equals(arr[i][0], arr[i][1]))k++;
            else {
                if (arr[i][0]==Math.min(arr[i][0],arr[i][1]))l1=1;
                else l2=1;
            }
        }
        if (l1+l2+k>1)System.out.println(sum);
        else {
            if (sum==0) System.out.println(0);
            else {
                if (l1 == 1) {
                    long min = sum - arr[0][0] + arr[0][1];
                    for (int i = 1; i < n; i++) min = Math.min(min, sum - arr[i][0] + arr[i][1]);
                    System.out.println(min);
                } else if (l2 == 1) {
                    long min = sum - arr[0][1] + arr[0][0];
                    for (int i = 1; i < n; i++) min = Math.min(min, sum - arr[i][1] + arr[i][0]);
                    System.out.println(min);
                }
            }
        }
    }
}


//11110
//1110