public class ValidParenthesis {

    class Stack{
        int max = 10;
        char [] stackSize =  new char[max];
        int top;
        public Stack(){
            top = -1;
        }
        boolean isEmpty(){  

            return top<0;
        }
        public boolean push(char sysmbol){
            if(top>max-1){
                return false;
            }
            else{
                stackSize[++top] = sysmbol;
                return true;
            }
          
        }

      

        public char Pop(){
            char sysmbol='N';
            if(isEmpty()){
                System.out.println("Stack is empty");
            return sysmbol;
            }
            else{
                 sysmbol =  stackSize[top--];
                return sysmbol;
            }
         
        }
    }
    public boolean isValid(String s) {
        Stack  stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                boolean result = stack.push(s.charAt(i));
                if(result){
                    System.out.println("insertion successfuly");
                }else{
                    System.out.println("Stack Overflow");
                }
            }else{
                
            }

        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ValidParenthesis vp =new ValidParenthesis();
        String s = "(}";
       boolean result =  vp.isValid(s);
       if(result){
           System.out.println("String Is Valid Parenthesis");
       }
       else{
           System.out.println("String Is not Valid Parenthesis");
       }
    }
    
}
