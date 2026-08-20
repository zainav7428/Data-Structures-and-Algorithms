class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0;
        int j=0;

        //result list;
        List<int[]> result = new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

             // Intersection exists
             if (start <= end) {
               result.add(new int[]{start, end});
             }

            // Move the interval which ends first
            
            if (firstList[i][1] < secondList[j][1]) {
               i++;
           } else {
          j++;
                                                                                  } // 
        }
        
        return result.toArray(new int[result.size()][]);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna