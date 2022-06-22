class AdditionOfBinary {
    public static String additionOfBinary(String number1, String number2) {

        int carry = 0;
        int i = number1.length() - 1;
        int j = number2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if(i>=0){
                sum = sum + Character.getNumericValue(number1.charAt(i--));  
            }
            if(j>=0){
                sum = sum + Character.getNumericValue(number2.charAt(j--));
            }
            sb.append(sum % 2);
            carry = sum / 2;         
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "1011"; // 1010
        String b = "0111"; // 1001 // 10011
        String result = additionOfBinary(a, b);
        System.out.println(result);
    }
}
