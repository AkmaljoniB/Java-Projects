package Codeforces;

import java.util.*;

public class Maximize_MEX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),mex=0;
            Integer[]arr=new Integer[n];
            Map<Integer,List<Integer>>map=new HashMap<>();
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(!map.containsKey(arr[i]%x))map.put(arr[i]%x,new LinkedList<>());
                map.get(arr[i]%x).add(arr[i]);
            }
            for(int i=0;i<n;i++){
                if(map.containsKey(mex%x)&&map.get(mex%x).size()!=0){
                    int a=map.get(mex%x).get(0);
                    map.get(mex%x).remove(0);
                    if(a==mex||a+x<=mex)mex++;
                    else break;
                }else break;
            }
            System.out.println(mex);
        }
    }
}