package Codeforces;

import java.util.Scanner;

public class Naibolsheye_vozvrastanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k=0,l=0,max=0;
        for (int i = 0;i<n;i++){
            int a=scanner.nextInt();
            if (a>l){
                k++;
            } else {
                max=Math.max(max,k);
                k=1;
            }
            l=a;
        }
        max=Math.max(max,k);
        System.out.println(max);
    }
}