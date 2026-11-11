class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            minDiff = Math.min(minDiff,arr[i]-arr[i-1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1] == minDiff){
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
return result;
      
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna