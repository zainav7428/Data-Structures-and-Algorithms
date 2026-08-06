class Solution {

    public boolean palindromeHelper(int i, int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0,
        j=s.length()-1;

        while(i<j){
            int left = s.charAt(i),
            right = s.charAt(j);

            if(left != right){
return palindromeHelper(i+1,j,s) || palindromeHelper(i,j-1,s);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna