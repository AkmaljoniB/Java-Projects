package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optimal_reduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer>list=new ArrayList<>();
            String s="YES";
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (list.size()==0||list.get(list.size()-1)!=a)list.add(a);
            }
            for (int i=1;i<list.size()-1;i++){
                if (list.get(i-1)>list.get(i)&&list.get(i)<list.get(i+1)){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}