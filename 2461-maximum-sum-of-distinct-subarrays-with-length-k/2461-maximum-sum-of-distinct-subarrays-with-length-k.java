class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
   HashSet<Integer> set = new HashSet<>();
long sum=0;
long max = 0;
int left = 0;

for(int right = 0;right<nums.length;right++){

   while (set.contains(nums[right])) {
    set.remove(nums[left]);
    sum-=nums[left];
    left++;
}


set.add(nums[right]);
sum+=nums[right];

if(right-left+1>k){
 set.remove(nums[left]);
    sum-=nums[left];
    left++;
}
if (right - left + 1 == k) {
     max = Math.max(max, sum);
  }


}

return max;

      
    }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna