class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 0;
        int[] res = new int[nums.length];
        while (i < nums.length) {
            int leftRes = 1;
            int rightRes = 1;
            for (int l = i - 1; l >= 0; l--) leftRes = leftRes * nums[l];
            for (int r = i + 1; r <= nums.length - 1; r++) rightRes = rightRes * nums[r];
    
            res[i++] = leftRes * rightRes;
        }
        return res;
    }
 
}


