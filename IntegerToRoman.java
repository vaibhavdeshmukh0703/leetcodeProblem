public class IntegerToRoman {
   
    
     public Numrals[] numrals = {
         new Numrals("M", 1000),
         new Numrals("CM", 900),
         new Numrals("D", 500),
         new  Numrals("CD", 400),
         new Numrals("C", 100),
         new Numrals("XC", 90),
         new Numrals("L", 50),
         new Numrals("XL", 40),
         new Numrals("X", 10),
         new Numrals("IX", 9),
         new Numrals("V", 5),
         new Numrals("IV",4),
         new Numrals("I", 1)
     };
    
    public String integerToRoman(int number){
        //250 == CCL
        String result ="";
        for (Numrals numral : numrals) {
         int reminder = number / numral.value;   //250/100 = 2 = 50
            result = result + numral.roman.repeat(reminder);
            number = number % numral.value;
        }

        return result;
    }
   

    class Numrals{

        public String roman;
        public int value;

        Numrals(String roman, int value){
            this.roman = roman;
            this.value = value;
        }
    }
   public static void main(String[] args) {
       IntegerToRoman  ir = new IntegerToRoman();
        String romanString = ir.integerToRoman(25);       
        System.out.println(romanString);
   } 
}
