package Task;

public class Gardonidan_az_dui_ba_dahi {
    public static void main(String[] args) {
        System.out.println(toDecimal("1111"));
    }
    public static int toDecimal(String base2){
     char[] chars = base2.toCharArray();
     int result = 0;
     int mult=1;
     for (int i=base2.length()-1;i>=0;i--){
         if (chars[i]=='1'){
             result +=mult;
         }
         mult*=2;
     }
     return result;
    }

}