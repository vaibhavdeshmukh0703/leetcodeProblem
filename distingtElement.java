import java.util.Arrays;

public class distingtElement {
    public static int distElement(int[] element){
       int count=0;
       Arrays.sort(element);
       for (int i=0;i<element.length-1;i++) {
           if(element[i] != element[i+1] ){
            count++;
           }
       }
    return count+1;
    }
    public static void main(String[] args) {
        int[] element = {5,7,5,7,8,8,5};//{5,5,7,7,8,8}
       int distElement =  distElement(element);
       System.out.println(distElement);
    }
}
