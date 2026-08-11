class Solution {
    public String reverseVowels(String s) {
// first cpnvert into array because array is immutable it can not be take as a charracter
        char[] arr = s.toCharArray();

        int i = 0;
        int j=arr.length-1;
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
            }
    else if(!isVowel(arr[j])){
        j--;
    }
    else{
        //swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
    
        }
return new String(arr);
      
}
  boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
               c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
 }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna