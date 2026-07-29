class Solution {
    public void printTillN(int n) {
        // Base Case
        if (n == 0) {
            return;
        }

        // Recursive Call
        printTillN(n - 1);

        // Print after recursion
        System.out.print(n + " ");
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna