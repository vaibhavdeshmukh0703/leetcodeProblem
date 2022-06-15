public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {

        boolean flag = true;

        if (nums.length < 0) {
            return 0;
        }
         else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    flag = false;
                    return i;

                }
            }
        }
        if (flag) {
            for (int j = 0; j < nums.length; j++) {
                
                if(nums[0]>target){
                    return 0;
                }
                else if (nums[nums.length - 1] < target) {
                    return nums.length;
                }else if(nums[j]<target && target<nums[j+1]){
                    return j+1;
                }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        SearchInsertPosition sp = new SearchInsertPosition();
        int[] inputArray = { 1};
        int target = 2;
        int result = sp.searchInsertPosition(inputArray, target);
        System.out.println(result);
    }
}
