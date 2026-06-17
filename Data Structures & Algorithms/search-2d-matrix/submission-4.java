class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int columns = matrix[0].length;
        int high = matrix.length - 1;
        int rowCandidate = 0;
        while (low <= high) {
            int midRow = (low + high) / 2;
            if (target < matrix[midRow][0]) {
                high = midRow - 1;
            }
            else  {
                rowCandidate = midRow;
                low = midRow + 1;
            }
        }
        for (int j = 0; j < columns; j++) {
            if (target == matrix[rowCandidate][j]) {
                return true;
            }
        }
        return false;
    }
}
