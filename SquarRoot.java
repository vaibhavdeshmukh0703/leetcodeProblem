import java.util.HashMap;

/**
 * SquarRoot
 */
public class SquarRoot {
    public static int squareRoot(int number){
       // 10 --- 1 2 3 4 5 6 7 8 9 10
       int left = 1;
       int right = number;

       if(number<2){
        return number;
       }
       while (left<right) {
        double mid = left + Math.floor((right-left)/2);
        if(mid * mid == number){
            return (int) mid;
        }
        else if(mid * mid > number){
            right = (int) mid;
        }
        else if(mid * mid <number){
            left = (int)mid+1;
        }
      
       }

       
      
        return left-1;
    }
   
    public static void main(String[] args) {
        int number = 9;
        int result=squareRoot(number);
        System.out.println(result);
    }
}