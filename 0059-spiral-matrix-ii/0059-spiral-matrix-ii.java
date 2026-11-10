
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while(top <= bottom && left <= right) {

            // Left to Right
            for(int j = left; j <= right; j++) {
                res[top][j] = num++;
            }
            top++;

            // Top to Bottom
            for(int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            right--;

            // Right to Left
            for(int j = right; j >= left; j--) {
                res[bottom][j] = num++;
            }
            bottom--;

            // Bottom to Top
            for(int i = bottom; i >= top; i--) {
                res[i][left] = num++;
            }
            left++;
        }

        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna