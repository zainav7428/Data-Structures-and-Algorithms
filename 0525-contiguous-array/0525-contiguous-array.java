class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

    
        int balanced = 0;
        int maxLength = 0;
        map.put(0,-1);

        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                balanced--;
            }else{
                balanced ++;
            }
            if(map.containsKey(balanced)){
                int length = i-map.get(balanced);
                maxLength = Math.max(maxLength, length);
            }else{
                map.put(balanced,i);
            }
            
        }
        return maxLength;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna