import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Use a 1D array to store the minimum path sums. 
        // Size is 'n' because the bottom row has exactly 'n' elements.
        int[] dp = new int[n];
        
        // Initialize the dp array with the values from the bottom row of the triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }
        
        // Iterate upwards starting from the second-to-last row
        for (int row = n - 2; row >= 0; row--) {
            // For each element in the current row, update the dp array
            for (int i = 0; i <= row; i++) {
                // The new minimum path to this cell is its own value plus the 
                // minimum of the two adjacent cells in the row immediately below it
                dp[i] = triangle.get(row).get(i) + Math.min(dp[i], dp[i + 1]);
            }
        }
        
        // The top element (index 0) will now contain the minimum path sum
        return dp[0];
    }
}
