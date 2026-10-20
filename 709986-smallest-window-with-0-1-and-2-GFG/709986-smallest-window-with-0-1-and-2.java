class Solution {
    public int smallestSubstring(String s) {
        int n = s.length();
        int min = Integer.MAX_VALUE;

        int zero = -1, one = -1, two = -1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '0') zero = i;
            if (ch == '1') one = i;
            if (ch == '2') two = i;

            if (zero != -1 && one != -1 && two != -1) {
                int start = Math.min(zero, Math.min(one, two));
                int len = i - start + 1;

                min = Math.min(min, len);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna