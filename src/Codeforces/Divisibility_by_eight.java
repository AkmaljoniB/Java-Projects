package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Divisibility_by_eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(),p="NO";
        if (s.contains("0"))p="YES\n0";
        else if (s.contains("8"))p="YES\n8";
        else {
            Map<Integer,String> map=new HashMap<>();
            for (int i=16;i<100;i+=8)map.put(i/10,i%10+"");
            String[][]ars=new String[112][3];
            int l=0;
            for (int i=104;i<1000;i+=8) {
                ars[l][0]=i/100+"";
                ars[l][1]=i/10%10+"";
                ars[l][2]=i%10+"";
                l++;
            }
            for (int i=1;i<=map.size();i++){
                if (s.contains(i+"")&&s.indexOf(i+"")<s.indexOf(map.get(i))){
                    p="YES\n"+i+map.get(i);
                    break;
                }
            }
            if (p.equals("NO")){
                for (int i=0;i<112;i++) {
                    if (s.contains(ars[i][0])&&s.indexOf(ars[i][0])<s.indexOf(ars[i][1],s.indexOf(ars[i][0])+1)&&s.indexOf(ars[i][1],s.indexOf(ars[i][0])+1)<s.indexOf(ars[i][2],s.indexOf(ars[i][1])+1)){
                        p="YES\n"+ars[i][0]+ars[i][1]+ars[i][2];
                        break;
                    }
                }
            }
        }
        System.out.println(p);
    }
}