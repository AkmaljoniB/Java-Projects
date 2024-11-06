package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fulfillment_of_conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n =sc.nextInt();
            int l =0,r=Integer.MAX_VALUE;
            List<Integer>list =new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                int a =sc.nextInt();
                int x= sc.nextInt();
                if (a==1)l=Math.max(x,l);
                else if (a==2)r=Math.min(x,r);
                else list.add(x);
            }
            int k =0;
            for (Integer integer : list) {
                if (integer >= l && integer <= r ) k++;
            }
            System.out.println(Math.max(r-l-k+1,0));
        }
    }
}
