class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = ((size) * (size + 1)) / 2;
        int arraySum = 0;
        for(int i = 0; i < size; i++) {
            arraySum = arraySum + nums[i];
        }
        return (sum - arraySum);
        
    }
}