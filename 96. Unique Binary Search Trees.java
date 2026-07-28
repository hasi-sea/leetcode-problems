class Solution {
    public int numTrees(int n) {
        // Array to store the number of unique BSTs for each number of nodes
        int[] G = new int[n + 1];
        
        // Base cases: 
        // 0 nodes = 1 empty tree
        // 1 node = 1 tree
        G[0] = 1;
        G[1] = 1;
        
        // Build up the number of trees from 2 to n
        for (int i = 2; i <= n; i++) {
            // For a sequence of length i, choose each number j as the root
            for (int j = 1; j <= i; j++) {
                // The number of unique BSTs with j as root is the product of 
                // the number of possible left subtrees and right subtrees
                G[i] += G[j - 1] * G[i - j];
            }
        }
        
        return G[n];
    }
}
