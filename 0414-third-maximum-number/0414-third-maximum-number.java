import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        
        if (s.size() < 3) return Collections.max(s);
        
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));
        
        return Collections.max(s);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna