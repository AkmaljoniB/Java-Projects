package Codeforces;

import java.util.*;

public class Minimizing_deck_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),a=sc.nextInt();
            Deque<Integer> dq=new ArrayDeque<>();;
            dq.addFirst(a);
            for (int i=1;i<n;i++){
                int b=sc.nextInt();
                if (b<a){
                    dq.addFirst(b);
                    a=b;
                } else dq.addLast(b);
            }
            for(int i:dq) System.out.print(i+" ");
            System.out.println();
        }
    }
}