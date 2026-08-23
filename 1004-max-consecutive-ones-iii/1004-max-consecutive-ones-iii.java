class Solution {
        public int longestOnes(int[] nums, int k) {
                int left = 0;
                        int zeroCount = 0;
                                int max = 0;

                                        for (int right = 0; right < nums.length; right++) {

                                                    // Agar 0 mila
                                                                if (nums[right] == 0) {
                                                                                zeroCount++;
                                                                                            }

                                                                                                        // Agar zeros k se zyada ho gaye
                                                                                                                    while (zeroCount > k) {

                                                                                                                                    if (nums[left] == 0) {
                                                                                                                                                        zeroCount--;
                                                                                                                                                                        }

                                                                                                                                                                                        left++;
                                                                                                                                                                                                    }

                                                                                                                                                                                                                // Current window ki length
                                                                                                                                                                                                                            int length = right - left + 1;

                                                                                                                                                                                                                                        max = Math.max(max, length);
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                        return max;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna