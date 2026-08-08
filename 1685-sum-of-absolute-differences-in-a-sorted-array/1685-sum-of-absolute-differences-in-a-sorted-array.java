class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        int[] leftSum = new int[n];
        int sum = 0;

        for(int i = 1; i < n; i++) {
            sum += nums[i - 1];
            leftSum[i] = sum;
        }

        int[] rightSum = new int[n];
        int sum2 = 0;

        for(int i = n - 2; i >= 0; i--) {
            sum2 += nums[i + 1];
            rightSum[i] = sum2;
        }

        for(int i = 0; i < n; i++) {

            result[i] =
                nums[i] * i - leftSum[i]
                + rightSum[i] - nums[i] * (n - 1 - i);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna