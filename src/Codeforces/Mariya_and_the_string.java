package Codeforces;

import java.util.Scanner;

public class Mariya_and_the_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            int l = s.length() - s.replace("B", "").length();
            if (l == k) System.out.println(0);
            else if (l > k) {
                System.out.println(1);
                for (int i =0;i<n;i++){
                    if (s.charAt(i) == 'B'){
                        l--;
                        if (l==k){
                            System.out.println((i+1)+" A");
                            break;
                        }
                    }
                }
            } else {
                System.out.println(1);
                for (int i = 0;i<n;i++){
                    if (s.charAt(i) == 'A')l++;
                    if (l==k){
                        System.out.println((i+1)+" B");
                        break;
                    }
                }
            }
        }
    }
}
