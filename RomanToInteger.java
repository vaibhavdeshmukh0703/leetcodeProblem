import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        String romanString = "VX";
        int result = romanToIntegerConversion(romanString);
        System.out.println(result);

    }

    private static int romanToIntegerConversion(String romanString) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int stringLength = romanString.length();
        int result = hm.get(romanString.charAt(stringLength - 1));
        // XVI = 10+5+1 = 16 result = 1;
        for (int pointer = stringLength - 1; pointer > 0; pointer--) {
            if (hm.get(romanString.charAt(pointer)) < hm.get(romanString.charAt(pointer - 1))) {
                result = result + hm.get(romanString.charAt(pointer - 1));
            } else {
                result = result - hm.get(romanString.charAt(pointer - 1));
            }
        }

        return result;
    }

}
