class Solution {
    public int nthStair(int n) {
        // Code here
int[] dp = new int[n + 1];

       dp[0] = 1;

       for (int step = 1; step <= 2; step++) {

           for (int i = step; i <= n; i++) {

               dp[i] += dp[i - step];
           }
       }

       return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna