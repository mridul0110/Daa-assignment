class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row = m.length;
        int cols = m[0].length;
        int s = 0;
        int e = row * cols - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int r = mid / cols;
            int c = mid % cols;

            if (m[r][c] == target) {
                return true;
            }

            if (m[r][c] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }
}