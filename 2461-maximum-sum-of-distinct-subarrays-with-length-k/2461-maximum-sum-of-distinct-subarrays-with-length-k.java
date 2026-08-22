class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;

        HashSet<Integer> set = new HashSet<>();
        int left=0;
for(int i = 0;i<nums.length;i++){
        while(set.contains(nums[i])){
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }

        set.add(nums[i]);
        sum+=nums[i];

        if(i-left+1>k){
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
         if (i - left + 1 == k) {
            max = Math.max(max, sum);
         }
}
           return max;  
         }
      
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna