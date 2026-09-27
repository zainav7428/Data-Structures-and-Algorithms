class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 0) {
            return ans;
        }

        ans.add(0);

        if (n == 1) {
            return ans;
        }

        ans.add(1);

        for (int i = 2; i < n; i++) {
            ans.add(ans.get(i - 1) + ans.get(i - 2));
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna