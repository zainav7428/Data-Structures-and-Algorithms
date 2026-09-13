class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1 = arr[i];
                
            }else if(arr[i] < max1 && arr[i] > max2){
                
                max2 = arr[i];
            }
           

        }
         if(max2 == Integer.MIN_VALUE) {
                        return -1;
                    }
        return max2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna