import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();

        for (char symbol : s.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            } else if (symbol == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (symbol == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (symbol == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else{
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        String s = "(){}}";
        boolean result = vp.isValid(s);
        if (result) {
            System.out.println("String Is Valid Parenthesis");
        } else {
            System.out.println("String Is not Valid Parenthesis");
        }
    }
}
