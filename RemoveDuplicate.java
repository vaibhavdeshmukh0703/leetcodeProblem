import java.util.ArrayList;

class RemoveDuplicate {

    public int removeDuplicates(int[] arr) {

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // for(Integer number : nums){
        // if(!list.contains(number)){
        // list.add(number);
        // }
        // }
        // nums = list.toArray();
        // return nums.length - list.size();
        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int UniqeNumberCount = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                UniqeNumberCount++;
            }
        }
        return UniqeNumberCount;
    }

    public static void main(String args[]) {
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = rd.removeDuplicates(nums);
        System.out.println("Removed Elements-->" + k);
    }

}