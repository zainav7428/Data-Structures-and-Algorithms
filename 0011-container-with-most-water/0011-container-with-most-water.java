class Solution {
    public int maxArea(int[] height) {
        
        int i = 0;
        int j = height.length-1;
        int max =0;
        while(i<j){
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
            if(height[i] < height[j]) {
                    i++;
                    } else {
                        j--;
                        }
            }
             return max;
        }
       
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna