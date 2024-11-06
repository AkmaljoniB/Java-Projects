package Codeforces;

import java.util.*;

public class Morning_running{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            List<List<Integer>>list=new ArrayList<>();
            String[]arr=new String[n];
            for(int i=0;i<n;i++){
                list.add(new ArrayList<>());
                for(int j=0;j<m;j++)list.get(i).add(sc.nextInt());
                Collections.sort(list.get(i));
            }
            for(int j=0;j<m;j++){
                int min=list.get(0).get(0),l=0;
                for(int i=1;i<n;i++){
                    if(min>list.get(i).get(0)){
                        min=list.get(i).get(0);
                        l=i;
                    }
                }
                for(int i=0;i<n;i++){
                    if(j==0)arr[i]="";
                    if(i!=l){
                        arr[i]=arr[i]+list.get(i).get(list.get(i).size()-1)+" ";
                        list.get(i).remove(list.get(i).size()-1);
                    }else{
                        arr[i]=arr[i]+list.get(i).get(0)+" ";
                        list.get(i).remove(0);
                    }
                }
            }
            for(int i=0;i<n;i++) System.out.println(arr[i]);
        }
    }
}