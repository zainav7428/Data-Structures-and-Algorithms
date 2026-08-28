class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int total = 0;
        
        int currentMax = 0;
        int maxSum = nums[0];
        
        int currentMin = 0;
        int minSum = nums[0];
        
        for (int num : nums) {
            
            // Normal maximum subarray
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);
            
            // Minimum subarray
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
            
            total += num;
        }
        
        // Agar saare elements negative hain
        if (maxSum < 0) {
            return maxSum;
        }
        
        // Circular maximum
        int circularSum = total - minSum;
        
        return Math.max(maxSum, circularSum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna