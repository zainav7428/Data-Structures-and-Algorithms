class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if(p.length()>s.length()){
            return ans;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch: p.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int k= p.length();

         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if (i >= k) {
                char old = s.charAt(i - k);
                map2.put(old, map2.get(old) - 1);

                if (map2.get(old) == 0) {
                    map2.remove(old);
                }
            }

            if (map1.equals(map2)) {
                ans.add(i - k + 1);
            }
        }

        return ans;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna