package For_in_For;

public class Test_10 {
    public static void main(String[] args) {
        for (int i = 61; i >= 21; i=i-10) {
            for (int j = 10; j < i-10; j=j+10) {
                System.out.print("  " +(i-j-1));
            }
            System.out.println();
        }
    }
}
