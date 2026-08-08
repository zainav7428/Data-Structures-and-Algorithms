class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int[] left = new int[n];
        int count = 0;

        for(int i=1;i<n;i++){
count+=nums[i-1];
left[i] = count;
        }

        int[] right = new int[n];
        int count1=0;
        for(int i=n-2;i>=0;i--){
            count1+=nums[i+1];
            right[i] = count1;
        }

for(int i=0;i<n;i++){
        if(left[i] == right[i]){
            return i;
        }

}
return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna