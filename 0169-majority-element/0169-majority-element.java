import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        int maxCount = 0;
        int majorityElement = 0;

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int currentCount = entry.getValue();

            if (currentCount > maxCount) {
                maxCount = currentCount;
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}
