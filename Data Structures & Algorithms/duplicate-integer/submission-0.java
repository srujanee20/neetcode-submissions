class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int x: nums)
            if (!unique.add(x))
                return true;

        return false;
    }
}