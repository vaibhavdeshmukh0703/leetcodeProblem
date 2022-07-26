
public class ClimbingStairCase {
    public static int climbingStairCase(int steps){
       
            while(steps>0)
        if(steps<=2){
            return steps;
        }
        else{
           return  steps = climbingStairCase(steps-1) + climbingStairCase(steps-2);
        }
        return steps;
    }
   public static void main(String[] args) {
    int steps = 3;
    int result = climbingStairCase(steps);
     System.out.println(result);
   } 
}
