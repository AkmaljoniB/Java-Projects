package Codeforces;

import java.util.*;

public class Special_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[]arr=new int[n+1],nums=new int[n+1];
            Set<Integer> set=new HashSet<>();
            for (int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
                nums[arr[i]]++;
            }
            for (int j=1;j<=n;j++) {
                int s=arr[j];
                for (int i=j+1;i<=n;i++) {
                    s+=arr[i];
                    if (s<=n)set.add(s);
                    else break;
                }
            }
            long k=0;
            for (int i=1;i<=n;i++)if(nums[i]!=0&&set.contains(i)) k += nums[i];
            System.out.println(k);
        }
    }
}