import java.util.HashMap;

class Solution {
    public int romanToInteger(String s) {

        HashMap<Character, Integer> romanMap = new HashMap<>();

        // Step 1: Insert Roman symbols and their values
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Step 2: Traverse the string
        for (int i = 0; i < s.length(); i++) {

            int current = romanMap.get(s.charAt(i));

            // Step 3: Compare current and next values
            if (i + 1 < s.length() &&
                current < romanMap.get(s.charAt(i + 1))) {

                result -= current;

            } else {
                result += current;
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna