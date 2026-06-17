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
            } else {
                rowCandidate = midRow;
                low = midRow + 1;
            }
        }
        int lowC = 0;
        int highC = columns - 1;
        while (lowC <= highC) {
            int midColumn = (lowC + highC) / 2;
            if(target==matrix[rowCandidate][midColumn]) return true;
            if (target > matrix[rowCandidate][midColumn])
                lowC = midColumn + 1;
            else {
                highC = midColumn-1;
            }
        }
        return false;
    }
   
}
