package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Division_by_two_and_rearrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            List<Integer>list=new LinkedList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                while (arr[i] > n) arr[i] /= 2;
                list.add(arr[i]);
            }
            List<Integer>list1=new LinkedList<>();
            for (int i = 1; i <=n ; i++) {
                if (list.contains(i)) {
                    Object ob = i;
                    list.remove(ob);
                } else list1.add(i);
            }
            for (int a : list) {
                while (a > 0) {
                    a /= 2;
                    if (list1.contains(a)) {
                        Object ob = a;
                        list1.remove(ob);
                        break;
                    }
                }
            }
            if (list1.size()==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
