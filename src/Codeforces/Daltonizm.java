package Codeforces;

import java.util.Scanner;

public class Daltonizm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            String s1 = scanner.next();
            String s2 = scanner.next();
            int k=0;
            s1=s1.replace("G","B");
            s2=s2.replace("G","B");
            for (int i=0;i<n;i++){
                if (!s1.substring(i,i+1).equals(s2.substring(i,i+1))){
                    System.out.println("NO");
                    k++;
                    break;
                }
            }
            if (k==0){
                System.out.println("YES");
            }
        }
    }
}