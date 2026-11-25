
class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int currMax = nums[0];
        int maxSum = nums[0];

        int currMin = nums[0];
        int minSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            // Maximum Kadane
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(currMax, maxSum);

            // Minimum Kadane
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(currMin, minSum);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna