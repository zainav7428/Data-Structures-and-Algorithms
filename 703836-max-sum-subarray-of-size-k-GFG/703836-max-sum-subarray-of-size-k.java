class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        // First window ka sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;

        // Next windows
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna