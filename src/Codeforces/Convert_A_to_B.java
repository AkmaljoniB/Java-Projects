package Codeforces;

import java.util.Scanner;

public class Convert_A_to_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),k=0,l1=0,l2=0;
            int[]arr=new int[n];
            for (int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
                if (arr[i]==1)l1++;
            }
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (a!=arr[i])k++;
                if (a==1)l2++;
            }
            System.out.println(l1==l2&&l1!=n&&l1!=0?Math.min(1,k):Math.min(k,Math.abs(l1-l2)+1));
        }
    }
}
