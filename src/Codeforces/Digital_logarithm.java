package Codeforces;

import java.util.*;

public class Digital_logarithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            List<Integer>a=new ArrayList<>(),b=new ArrayList<>();
            for (int i=0;i<n;i++)a.add(sc.nextInt());
            for (int i=0;i<n;i++) {
                int q=sc.nextInt();
                if (a.contains(q))a.remove((Object)q);
                else b.add(q);
            }
        }
    }
}