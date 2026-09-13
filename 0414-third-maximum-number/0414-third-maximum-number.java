class Solution {
    public int thirdMax(int[] nums) {

        long max = nums[0];
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == max || nums[i] == second) {
                continue;
            }

            if (nums[i] > max) {
                third = second;
                second = max;
                max = nums[i];
            }
            else if (nums[i] > second) {
                third = second;
                second = nums[i];
            }
            else if (nums[i] > third) {
                third = nums[i];
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) third;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna