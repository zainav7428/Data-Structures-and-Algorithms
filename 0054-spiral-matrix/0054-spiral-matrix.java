class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {

            // Left to Right
            for(int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;

            // Top to Bottom
            for(int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // Right to Left
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom to Top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}                                                                                                                                                                                                                                                                   

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna