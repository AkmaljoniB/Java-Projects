package Codeforces;

import java.util.*;

public class Almost_all_are_multiples{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt();
            if(n%x==0){
                StringBuilder sb=new StringBuilder();
                sb.append(x+" ");
                List<Integer>list=new ArrayList<>();
                list.add(x);
                for(int i=2;i<n;i++){
                    if(!list.contains(i))sb.append(i+" ");
                    else{
                        int j=2;
                        while(i*j<=n&&n%(i*j)!=0)j++;
                        if(n%(i*j)==0){
                            list.add(i*j);
                            sb.append((i*j)+" ");
                        }else sb.append(n+" ");
                    }
                }
                System.out.println(sb+"1");
            }else System.out.println("-1");
        }
    }
}