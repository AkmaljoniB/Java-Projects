package Codeforces;

import java.util.Scanner;

public class Before_the_exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int sumtime = scanner.nextInt();
        int l = 0;
        int[]list = new int[d];
        int[] arr = new int[d];
        for (int i = 0; i < d; i++) {
            int mintime = scanner.nextInt();
            int maxtime = scanner.nextInt();
            arr[i] = mintime;
            if (sumtime - maxtime <= 0) {
                if (sumtime >= mintime && sumtime <= maxtime) {
                    l = sumtime;
                } else {
                    l = mintime;
                }
            } else l = maxtime;

            sumtime -= l;
            list[i] = l;
        }
        for (int i =0;i<d;i++){
            if (sumtime<0){
                sumtime+=(list[i]-arr[i]);
                list[i] = arr[i];
                if (sumtime>0){
                    list[i]=arr[i]+sumtime;
                    sumtime=0;
                }
            } else break;
        }
        if (sumtime == 0) {
            System.out.println("YES");
            for (Integer integer : list) System.out.print(integer + " ");
        } else System.out.println("NO");
    }
}
