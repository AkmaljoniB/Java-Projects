package Alexeev;

import java.text.*;
import java.util.*;

public class Alexeev_0339{
    public static void main(String[]args)throws ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat date=new SimpleDateFormat("dd.MM.yyyy");
        Date l=date.parse(sc.nextLine()),r=date.parse(sc.nextLine());
//        System.out.println((r.getTime()-l.getTime())/(24*60*60*1000));
    }
}