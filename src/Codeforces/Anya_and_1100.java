package Codeforces;

import java.util.*;

public class Anya_and_1100{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char[]arr=sc.next().toCharArray();
            int q=sc.nextInt();
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<arr.length-3;j++){
                if(arr[j]==arr[j+1]&&arr[j]=='1'&&arr[j+2]==arr[j+3]&&arr[j+2]=='0'){
                    list.add(j);
                    break;
                }
            }
            while(q-->0){
                int i=sc.nextInt()-1,v=sc.nextInt();
                arr[i]=(char)('0'+v);
                for(int j=0;j<list.size();j++){
                    if(i>=list.get(j)&&i<=list.get(j)+3){
                        list.remove(j);
                        break;
                    }
                }
                for(int j=Math.max(i-3,0);j<Math.min(i+1,arr.length-3);j++){
                    if(arr[j]==arr[j+1]&&arr[j]=='1'&&arr[j+2]==arr[j+3]&&arr[j+2]=='0'){
                        list.add(j);
                        break;
                    }
                }
                System.out.println(list.size()!=0?"YES":"NO");
            }
        }
    }
}
//1010