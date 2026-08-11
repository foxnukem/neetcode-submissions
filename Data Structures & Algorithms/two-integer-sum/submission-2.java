class Solution {
    public int[] twoSum(int[] nums, int target) {
        int startIndex = 0;

        for (int i = startIndex; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { startIndex, startIndex + 1 };
    }
}
