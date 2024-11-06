package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Array_compression_and_GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> juft = new LinkedList<>();
            List<Integer> toq = new LinkedList<>();
            for (int i = 0; i < n * 2; i++) {
                if (scanner.nextInt() % 2 == 0) juft.add(i);
                else toq.add(i);
            }
            int k =n-1;
            for (int i = 0; i<juft.size()-juft.size()%2; i+=2) {
                System.out.println((juft.get(i)+1)+" "+(juft.get(i+1)+1));
                k--;
                if (k==0)break;
            }
            if (k!=0) {
                for (int i = 0; i < toq.size()-toq.size()%2 ; i += 2) {
                    System.out.println((toq.get(i) + 1) + " " + (toq.get(i + 1) + 1));
                    k--;
                    if (k==0)break;
                }
            }
        }
    }
}
