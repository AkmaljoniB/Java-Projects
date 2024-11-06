package Codeforces;

import java.util.Scanner;

public class Kosvennaya_sortirovka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        for (int i=0;i<t;i++){
            int n=scanner.nextInt();
            int [] arr=new int[n];
            for (int j=0;j<arr.length;j++){
                arr[j]= scanner.nextInt();
            }
            int k=0;
            for (int j=1;j<arr.length;j++){
                if (arr[0]<arr[j]){
                    k++;
                }
            }
            if (k==arr.length-1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
