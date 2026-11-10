
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] res = new int[m][n];

        // Initially fill all cells with -1
        for(int i = 0; i < m; i++) {
            Arrays.fill(res[i], -1);
        }

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        ListNode curr = head;

        while(curr != null && top <= bottom && left <= right) {

            // Left to Right
            for(int j = left; j <= right && curr != null; j++) {
                res[top][j] = curr.val;
                curr = curr.next;
            }
            top++;

            // Top to Bottom
            for(int i = top; i <= bottom && curr != null; i++) {
                res[i][right] = curr.val;
                curr = curr.next;
            }
            right--;

            // Right to Left
            for(int j = right; j >= left && curr != null; j--) {
                res[bottom][j] = curr.val;
                curr = curr.next;
            }
            bottom--;

            // Bottom to Top
            for(int i = bottom; i >= top && curr != null; i--) {
                res[i][left] = curr.val;
                curr = curr.next;
            }
            left++;
        }

        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna