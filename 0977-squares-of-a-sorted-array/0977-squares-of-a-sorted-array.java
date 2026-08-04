class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        int i = 0,
        j=nums.length-1;

        // [-3,2,4]
        //i
        //       j
        

        int k = nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i])> Math.abs(nums[j])){
                res[k] = nums[i]*nums[i];
                i++;
            }else{
                res[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna