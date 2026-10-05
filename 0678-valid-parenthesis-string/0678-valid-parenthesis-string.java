class Solution {

    public boolean validCharacter(char ch) {
        if (ch == '(' || ch == ')' || ch == '*') {
            return true;
        }

        return false;
    }

    public boolean checkValidString(String s) {

        int minOpen = 0;
        int maxOpen = 0;

        for (char ch : s.toCharArray()) {

            if (!validCharacter(ch)) {
                return false;
            }

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            }

            else if (ch == ')') {
                minOpen--;
                maxOpen--;
            }

            else if (ch == '*') {
                minOpen--;
                maxOpen++;
            }

            // Agar maximum possible '(' bhi negative ho gaya
            if (maxOpen < 0) {
                return false;
            }

            // Minimum negative nahi ho sakta
            if (minOpen < 0) {
                minOpen = 0;
            }
        }

        return minOpen == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna