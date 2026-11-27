
class Solution {
    public int maxAscendingSum(int[] nums) {
        int Sum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > nums[i-1]) {
                Sum += nums[i];
            } else {
                Sum = nums[i];
            }

            if(Sum > maxSum) {
                maxSum = Sum;
            }
        }

        return maxSum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna