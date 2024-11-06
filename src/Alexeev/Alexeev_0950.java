package Alexeev;

import java.util.Scanner;

public class Alexeev_0950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p ="";
        for (int i=0; i<s.length();i++){
            if (s.substring(i,i+1).equals("0")){
                p = p.concat("0");
            } else if (s.substring(i,i+1).equals("1")){
                if (p.length()==0){
                    System.out.print("a");
                } else if (p.length()==1){
                    System.out.print("b");
                } else if (p.length()==2){
                    System.out.print("c");
                } else if (p.length()==3){
                    System.out.print("d");
                } else if (p.length()==4){
                    System.out.print("e");
                } else if (p.length()==5){
                    System.out.print("f");
                } else if (p.length()==6){
                    System.out.print("g");
                } else if (p.length()==7){
                    System.out.print("h");
                } else if (p.length()==8){
                    System.out.print("i");
                } else if (p.length()==9){
                    System.out.print("j");
                } else if (p.length()==10){
                    System.out.print("k");
                } else if (p.length()==11){
                    System.out.print("l");
                } else if (p.length()==12){
                    System.out.print("m");
                } else if (p.length()==13){
                    System.out.print("n");
                } else if (p.length()==14){
                    System.out.print("o");
                } else if (p.length()==15){
                    System.out.print("p");
                } else if (p.length()==16){
                    System.out.print("q");
                } else if (p.length()==17){
                    System.out.print("r");
                } else if (p.length()==18){
                    System.out.print("s");
                } else if (p.length()==19){
                    System.out.print("t");
                } else if (p.length()==20){
                    System.out.print("u");
                } else if (p.length()==21){
                    System.out.print("v");
                } else if (p.length()==22){
                    System.out.print("w");
                } else if (p.length()==23){
                    System.out.print("x");
                } else if (p.length()==24){
                    System.out.print("y");
                } else if (p.length()==25){
                    System.out.print("z");
                }
                p="";
            }
        }
    }
}
