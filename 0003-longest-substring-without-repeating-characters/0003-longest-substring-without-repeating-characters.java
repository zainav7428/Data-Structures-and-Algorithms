class Solution {
    public int lengthOfLongestSubstring(String s) {
int Max = 0;
int left = 0;
   HashSet<Character> set = new HashSet <>();
        for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        Max = Math.max(Max,right-left+1);
        }
        return Max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna