
class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                String left = s.substring(0, i);
                String right = s.substring(i + 1);

                return Math.max(
                    longestSubstring(left, k),
                    longestSubstring(right, k)
                );
            }
        }

        return s.length();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna