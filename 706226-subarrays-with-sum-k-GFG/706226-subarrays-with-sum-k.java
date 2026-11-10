class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap <Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        int sum =0;
        int ans = 0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           int  remove = sum-k;
            
            if(map.containsKey(remove)){
                ans += map.get(remove);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna