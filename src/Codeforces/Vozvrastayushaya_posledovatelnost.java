package Codeforces;

import java.util.Scanner;

public class Vozvrastayushaya_posledovatelnost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i != 0 && arr[i - 1] > arr[i]) {
                if (arr[i-1]-arr[i]%d==0){
                    k+=arr[i-1]-arr[i]/d;
                    arr[i]+= (arr[i-1]-arr[i]+1)*d;
                } else {
                    k+=(arr[i-1]-arr[i])/d+1;
                    arr[i]+= ((arr[i-1]-arr[i])/d+1)*d;
                }
            } else if (i != 0 && arr[i - 1] == arr[i]){
                k++;
                arr[i]+=d;
            }
        }
        System.out.println(k);
    }
}