class Solution {
    public int majorityElement(int[] nums) {
        
       int count = 0;
       int current = nums[0];
       for(int i=0;i<nums.length;i++){
        if(count == 0)
        {
         current =nums[i];
        }
        if(nums[i]==current){
            count++;
        }else{
            count--;
        }
        
       }
       return current;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna