package Codeforces;

import java.util.*;

public class Valleys_with_difficulties {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            int[]arr=new int[n];
            List<Integer> list=new ArrayList<>();
            arr[0]=sc.nextInt();
            list.add(arr[0]);
            for (int i=1;i<n;i++){
                arr[i]=sc.nextInt();
                if (arr[i]!=arr[i-1])list.add(arr[i]);
            }
            for (int i=0;i<list.size();i++){
                if ((i==0 && i!=list.size()-1 &&list.get(i)<list.get(i+1)) || (i!=0 &&i==list.size()-1 && list.get(i)<list.get(i-1))||(i!=0 && i!=list.size()-1 &&list.get(i)<list.get(i-1) &&list.get(i)<list.get(i+1)))k++;
            }
            if (list.size()==1)k++;
            System.out.println(k==1?"YES":"NO");
        }
    }
}