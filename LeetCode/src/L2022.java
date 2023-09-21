// LeetCode: 2022
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n)
            return new int[][] {}; // empty array [0][0] // early return
        int[][] matrix = new int[m][n];
        int idx = 0;
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                matrix[row][column] = original[idx++];
            }
        }
        return matrix;
    }
}