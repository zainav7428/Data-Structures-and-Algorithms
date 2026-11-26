class Solution {
    public String mergeAlternately(String word1, String word2) {
        
      int i=0;
      int j=0;
      StringBuffer result = new StringBuffer();
      while(i<word1.length() || j<word2.length()){
        if(i<word1.length()){
result.append(word1.charAt(i));
 i++;
        }
       

        if(j<word2.length()){
            result.append(word2.charAt(j));
              j++;
        }
      
      }
      return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna