class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // The goal is to pick every second element starting from the first index (index 0).
        // Example: [1, 2, 3, 4, 5] -> [1, 3, 5]
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i+=2){
            list.add(arr[i]);
            
        }
        
        // Hint 1: Initialize an ArrayList to store the result.
        // Hint 2: Use a for loop that starts at i = 0.
        // Hint 3: Instead of incrementing by 1 (i++), increment by 2 (i += 2) to skip one element.
        // Hint 4: Inside the loop, add arr[i] to your list.
        
        // Expected Time Complexity: O(n) - where n is the size of the array.
        // Expected Space Complexity: O(n) - to store the result list.
        
        // If you get stuck, check the "Video Solutions" section in the Solutions tab on the left!
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna