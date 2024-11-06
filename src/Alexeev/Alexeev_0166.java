package Alexeev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alexeev_0166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(k);
        int o = 0;
        for (int n = sc.nextInt(); n-- > 1; ) {
            int p = k / 5;
            int l = 0;
            int u = k % 5;
            if (u == 3) l = 1;
            else if (p > 0 && u!=0) {
                if (u == 1) l = 2;
                else if (u == 2) {
                    if (p > 1) {
                        p--;
                        l = 4;
                    } else l = 2;
                } else if (u == 4) l = 3;
                p--;
            }else if (u==4)l=1;
            int q = p * 9 + l * 5;
            k += q;
            list.add(q);
            o++;
            if (o > 2) {
                k -= list.get(0);
                list.remove(0);
            }
        }
        System.out.println(k);
    }
}