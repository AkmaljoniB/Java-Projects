package Codeforces;

import java.util.Scanner;

public class Hamburgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int kb = s.replace("S", "").replace("C", "").length();
        int ks = s.replace("B", "").replace("C", "").length();
        int kc = s.length() - kb - ks;
        int nb = sc.nextInt(), ns = sc.nextInt(), nc = sc.nextInt();
        int pb = sc.nextInt(), ps = sc.nextInt(), pc = sc.nextInt();
        long r = sc.nextLong(), k = 0;
        int l=0,p=0;
        if (kb>0)l++;
        if (ks>0)l++;
        if (kc>0)l++;
        while (true) {
            if (nb >= kb) nb -= kb;
            else {
                if (r>= (long) pb *(kb-nb)){
                    r-= (long) pb *(kb-nb);
                    nb=0;
                    p++;
                }else break;
            }
            if (ns >= ks) ns -= ks;
            else {
                if (r>=(long) ps*(ks-ns)){
                    r-=(long) ps*(ks-ns);
                    ns=0;
                    p++;
                }else break;
            }
            if (nc >= kc) nc -= kc;
            else {
                if (r>=(long) pc*(kc-nc)){
                    r-=(long) pc*(kc-nc);
                    nc=0;
                    p++;
                }else break;
            }
            k++;
            if (l==p)break;
            p=0;
        }
        k+=(r/((long) pb *(Math.max(kb-nb,0)) + (long) ps *(Math.max(ks-ns,0))+ (long) pc *(Math.max(kc-nc,0))));
        System.out.println(k);
    }
}