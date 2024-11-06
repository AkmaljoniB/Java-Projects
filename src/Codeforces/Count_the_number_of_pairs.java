package Codeforces;

import java.util.Scanner;

public class Count_the_number_of_pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[26];
            int[] A = new int[26];
            String s = scanner.next();
            for (int i = 0; i < n; i++) {
                String p = s.substring(i, i + 1);
                if (p.toLowerCase().equals(p)) a[p.hashCode() - 97]++;
                else A[p.hashCode() - 65]++;
            }
            int sum= 0;
            for (int i = 0; i < 26; i++) {
                sum+=Math.min(a[i],A[i]);
                if (k!=0&&Math.abs(A[i]-a[i])>1){
                    int min =Math.min(Math.abs(A[i]-a[i])/2,k);
                    k-=min;
                    sum+=min;
                }
            }
            System.out.println(sum);
        }
    }
}
