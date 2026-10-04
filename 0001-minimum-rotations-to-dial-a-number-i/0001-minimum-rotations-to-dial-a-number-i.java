class Solution {
    public int minRotations(String s) {
    int sum = 0;
        int prev = 0;
        for(int i=0;i<s.length();i++){
            int curr = s.charAt(i)-'0';//convert into digit
            int diff = Math.abs(curr-prev);
            sum+=Math.min(diff,10-diff);
            prev=curr;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna