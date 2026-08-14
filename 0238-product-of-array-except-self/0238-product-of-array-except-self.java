class Solution {
        public int[] productExceptSelf(int[] nums) {

                int n = nums.length;
                        int[] ans = new int[n];

                                int product = 1;

                                        // Left product
                                                for (int i = 0; i < n; i++) {
                                                            ans[i] = product;
                                                                        product *= nums[i];
                                                                                }

                                                                                        // Right product
                                                                                                product = 1;

                                                                                                        for (int i = n - 1; i >= 0; i--) {
                                                                                                                    ans[i] *= product;
                                                                                                                                product *= nums[i];
                                                                                                                                        }

                                                                                                                                                return ans;
                                                                                                                                                    }
                                                                                                                                                    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna