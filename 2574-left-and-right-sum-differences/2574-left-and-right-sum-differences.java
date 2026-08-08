class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];

        left[0] = 0;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += nums[i - 1];
            left[i] = sum;
        }

        int[] right = new int[n];

        right[n - 1] = 0;
        int sum2 = 0;

        for (int i = n - 2; i >= 0; i--) {
            sum2 += nums[i + 1];
            right[i] = sum2;
        }

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(left[i] - right[i]);
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna