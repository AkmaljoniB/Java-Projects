package Codeforces;

import java.util.*;

public class Photo_for_memory_2_round_version{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0,j=0;
        int[][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            arr[i][0]=arr[i][1]=sc.nextInt();
            if(l>arr[i][1])arr[i][1]=l;
            else arr[i][0]=l;
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        for(int i=n-1;i>=j;i--){
            int max=arr[i][1],l=0;
            while(arr[n-1][0]-arr[i][0]-l>=arr[j][0]){
                l+=arr[j][0];
                max=Math.max(max,arr[j][1]);
                j++;
            }
            s+=max;
        }
        System.out.println(s*arr[n-1][0]);
    }
}

//1 7
//1 6
//4 8
//5 7
//6 6

//.....................
//.....................
//.....................
//.....................
//....................
//............
