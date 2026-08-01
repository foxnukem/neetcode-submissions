class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ints = new HashSet<>();
        for (int num : nums) {
            ints.add(num);
        }

        return ints.size() < nums.length;
    }
}