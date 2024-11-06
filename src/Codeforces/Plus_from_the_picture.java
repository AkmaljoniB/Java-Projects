package Codeforces;

import java.util.Scanner;

public class Plus_from_the_picture{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt(),l=-1,p=-1,r=-1,q=-1;
        String s="YES",ars[]=new String[h];
        for(int i=0;i<h;i++){
            ars[i]=sc.next();
            if(l==-1){
                if(ars[i].contains("*")){
                    if(ars[i].indexOf("*")==ars[i].lastIndexOf("*"))l=ars[i].indexOf("*");
                    else {
                        s="NO";
                        break;
                    }
                }
            }else{
                if(ars[i].contains("*")){
                    if(q==0){
                        s="NO";
                        break;
                    }
                    if(ars[i].indexOf("*")!=ars[i].lastIndexOf("*")){
                        if(!ars[i].substring(ars[i].indexOf("*"),ars[i].lastIndexOf("*")).contains(".")&&ars[i].indexOf("*")<l&&ars[i].lastIndexOf("*")>l)p=0;
                        else{
                            s="NO";
                            break;
                        }
                    }else if(ars[i].indexOf("*")!=l){
                        s="NO";
                        break;
                    }else if(p!=-1)r=0;
                }else{
                    if(r==-1){
                        s="NO";
                        break;
                    }else q=0;
                }
            }
        }
        System.out.println(l==-1||p==-1||r==-1?"NO":s);
    }
}