class Solution {
    public int maxProduct(int[] nums) {

        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);

            currMin = Math.min(nums[i], currMin * nums[i]);

            maxProduct = Math.max(currMax, maxProduct);
        }

        return maxProduct;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna