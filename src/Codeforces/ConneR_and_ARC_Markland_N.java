package Codeforces;

import java.util.*;

public class ConneR_and_ARC_Markland_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),s=sc.nextInt(),k=sc.nextInt(),l=s,r=s,min=n;
            List<Integer>list=new ArrayList<>();
            for (int i=0;i<k;i++) list.add(sc.nextInt());
            while (true){
                if (l>0){
                    if (!list.contains(l))break;
                    l--;
                }
                if (r<=n){
                    if (!list.contains(r))break;
                    r++;
                }
            }
            if (l>0)min=s-l;
            if (r<=n)min=Math.min(min,r-s);
            System.out.println(min);
        }
    }
}
