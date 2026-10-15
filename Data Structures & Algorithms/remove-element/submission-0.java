class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tmp.add(nums[i]);
            }
        }
        int k = tmp.size() ;
        for (int i = 0; i<k; i++) {
            nums[i] = tmp.get(i);
        }
        for (int i = tmp.size(); i< n; i++) {
            nums[i] = k;
        }

        return k;
    }
}