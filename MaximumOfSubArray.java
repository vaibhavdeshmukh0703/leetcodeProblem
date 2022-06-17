import javax.xml.transform.SourceLocator;

public class MaximumOfSubArray {
    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6
    // Explanation: [4,-1,2,1] has the largest sum = 6.
    public static int maxSubArray(int[] nums) {
        // int sum = 0;
        // int maxNumber = 0;
        // if (inputArray.length == 1) {
        // return maxNumber = inputArray[0];
        // } else {
        // for (int i = 0; i < inputArray.length; i++) { // maxNumber = -2

        // if (sum >= 0) {
        // sum = sum + inputArray[i];

        // } if (sum < 0) {
        // sum = inputArray[i];
        // System.out.println("from sum<0 "+sum);
        // } if(sum > maxNumber) {
        // maxNumber = sum;
        // }
        // }
        // return maxNumber;
        // } // sum = 0

        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i < n; i++) {
            if (sum >= 0) {
                sum += nums[i];
            }
            if (sum < 0) {
              
                sum = nums[i];
                System.out.println("from sum<0"+sum);
            }
            if (sum > max) {
                max = sum;
            }

        }
        return max;
    }



    public static void main(String[] args) {
        int[] inputArray = { -2, -3};
        int result = maxSubArray(inputArray);
        System.out.println(result);
       
    }
}
