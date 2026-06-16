class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int mid = (n - 1) / 2;
        if (target == nums[mid])
            return mid;
        if (target > nums[mid]) {
            for (int i = mid; i < n; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }

        } else {
            for (int i = 0; i < mid; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}
