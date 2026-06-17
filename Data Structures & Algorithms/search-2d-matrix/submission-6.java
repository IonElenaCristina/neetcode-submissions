class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = (m * n) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = matrix[mid / n][mid % n];
            if (target == val) {
                return true;
            } else if (target > val) {
                low = mid + 1;

            } else if (target < val) {
                high = mid - 1;
            }
        }
          return false;
    }

}

