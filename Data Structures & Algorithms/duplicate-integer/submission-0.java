class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, true);
            } else {
                map.put(num, false);
            }
        }

        return map.entrySet().stream()
            .anyMatch(entry -> entry.getValue());
    }
}