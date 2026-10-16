class Solution {
    public int sumCounts(int[] nums) {
        int sum = 0;
        

        for(int i=0;i<nums.length;i++){
HashSet<Integer> set = new HashSet<>();
for(int j=i;j<nums.length;j++){
set.add(nums[j]);
 int count = set.size();
                sum+=count *count;
        }
    }
       return sum; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna