package Codingbat.Recursion_1;

public class Triangle {
    public int triangle(int rows) {
        if (rows%2==0){
            return (int) (rows*(rows/2+0.5));
        }
        return rows*(rows/2+1);
    }
}
