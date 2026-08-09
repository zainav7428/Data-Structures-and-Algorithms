class Solution {
    public int[] runningSum(int[] nums) {
      int result[] = new int[nums.length];
      int sum = 0;
      for (int i=0;i< nums.length;i++){
        sum = sum + nums[i];
        result[i] = sum;
      }
      return result; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna