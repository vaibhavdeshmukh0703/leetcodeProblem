import java.util.ArrayList;

class RemoveDuplicate{

     public int removeDuplicates(int[] arr) {

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // for(Integer number : nums){
        //     if(!list.contains(number)){
        //         list.add(number);
        //     }
        // }
        //  nums = list.toArray();
        // return nums.length - list.size();
         int writeIdx = 1; 
        
        for (int i=1; i<arr.length; i++) { 
            if (arr[i] != arr[i-1]) { 
                arr[writeIdx++] =  arr[i]; 
            }
        }
        
        return writeIdx; 
    }

    public static void main(String args[]) {
       RemoveDuplicate rd =new RemoveDuplicate();
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int  k = rd.removeDuplicates(nums);
       System.out.println("Removed Elements-->"+k);
    }
    
}