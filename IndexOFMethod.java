import javax.naming.spi.DirStateFactory.Result;

/*
 * 28. Implement strStr()
Easy

Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
  String hayStack = "mississippi";
        String needle = "issip";
 */
public class IndexOFMethod {

    public static int indexOf(String hayStack, String needle) {
        if (needle == "") {
            return 0;
        }

        if (needle.length() > hayStack.length() || !hayStack.contains(needle)) {
            System.out.println("from > if");
            return -1;
        }

        for (int i = 0; i <= hayStack.length() - needle.length(); i++) {
            if (hayStack.charAt(i) == needle.charAt(0)) {

                if (hayStack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String hayStack = "mississippi";
        String needle = "issip";
        int count = indexOf(hayStack, needle);
        System.out.println(count);

    }
}
