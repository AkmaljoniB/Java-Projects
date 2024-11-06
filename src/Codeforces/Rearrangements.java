package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Rearrangements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int n=sc.nextInt(),l=0,k=0;
        Map<Integer,List<Integer>>map=new HashMap<>();
        map.put(1,new ArrayList<>());
        int[][]arr=new int[n][2];
        int[]num=new int[n];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=i;
            if(arr[i][0]==1){
                map.get(1).add(k+1);
                num[arr[i][1]]=k+1;
                k++;
            }
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        for(int i=k;i<n;i++){
            if(map.containsKey(arr[i][0]-1)&&map.get(arr[i][0]-1).size()!=0){
                int p=map.get(arr[i][0]-1).get(0);
                if(!map.containsKey(arr[i][0]))map.put(arr[i][0],new ArrayList<>());
                map.get(arr[i][0]).add(p);
                map.get(arr[i][0]-1).remove(0);
                num[arr[i][1]]=p;
            }else{
                l=-1;
                break;
            }
        }
        if(l==-1)pr.println(l);
        else {
            pr.println(k);
            for(int i=0;i<n;i++)pr.print(num[i]+" ");
        }
        pr.close();
    }
}