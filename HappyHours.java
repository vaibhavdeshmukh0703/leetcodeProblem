/**
 * HappyHours
 */
public class HappyHours {

    public static boolean isHappy(int n) {
        int count=0;
        if (n > 0) {
            if (n == 1) {
                return true;
            }
            if (n == 2 || n == 3) {
                return false;
            }
          int result = forSingleDigitNumber(n);
               
        if(result == 1){
            System.out.println("");
            return true;
        }else{
            System.out.println("recursionn call"+ count+1);
            forSingleDigitNumber(n);
        }
        }else{
            return false;
        }
       return true;
    }

    public static int forSingleDigitNumber(int n) {
        int n1 = 0, n2 = 0;
      
System.out.println("n given by user"+n);
            int reminder = n % 10; // 19%10=9  81%10
        System.out.println("reminder is -->"+reminder);
            n1 = reminder * reminder;
            System.out.println("for reminder *  reminder-->"+n1);

            int division = (int) Math.floor(n / 10); // 9/10=0.9
        System.out.println("Division is --->"+division);
            if (division >= 1) {
                n2 = division * division;
                System.out.println("for division* division --->"+n2);
            }
            int result = n1+n2;
            System.out.println("From result value--->"+result/n/n);
          
            if(result==100){
                System.out.println("from return 1");
                return 1;
            }
             else {
                forSingleDigitNumber(result);
            }

        
        return n;

    }

    public static void main(String[] args) {
        boolean result = isHappy(2);
        System.out.println(result);
    }
}