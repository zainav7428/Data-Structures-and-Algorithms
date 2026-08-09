import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int remove = sum - k;

            if(map.containsKey(remove)) {
                answer += map.get(remove);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna