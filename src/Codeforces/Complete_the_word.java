package Codeforces;

import java.util.Scanner;

public class Complete_the_word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[]s=sc.next().toCharArray();
        if(s.length<26)System.out.println(-1);
        else {
            int l=0,p=0,a[]=new int[26];
            for(int i=0;i<26;i++){
                if(s[i]=='?')p++;
                else{
                    if(a[s[i]-'A']==0)l++;
                    a[s[i]-'A']++;
                }
            }
            for(int i=0;i<s.length-25;i++){
                if(l+p==26){
                    for(int j=i;j<i+26;j++){
                        if(s[j]=='?'){
                            for(int u=0;u<26;u++){
                                if(a[u]==0){
                                    s[j]=(char)('A'+u);
                                    a[u]++;
                                    break;
                                }
                            }
                        }
                    }
                    for(int j=0;j<s.length;j++){
                        if(s[j]=='?')s[j]='A';
                    }
                    break;
                }else if(i<s.length-26){
                    if(s[i]=='?')p--;
                    else{
                        a[s[i]-'A']--;
                        if(a[s[i]-'A']==0)l--;
                    }
                    if(s[i+26]=='?')p++;
                    else{
                        if(a[s[i+26]-'A']==0)l++;
                        a[s[i+26]-'A']++;
                    }
                }
            }
            if(l+p==26){
                StringBuilder sb=new StringBuilder();
                for(char c:s)sb.append(c);
                System.out.println(sb);
            }else System.out.println(-1);
        }
    }
}