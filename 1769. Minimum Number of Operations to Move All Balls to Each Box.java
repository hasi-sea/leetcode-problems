class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n]; // Initialized the output array
        
        for (int i = 0; i < n; i++) {
            int operations = 0;
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') { // Fixed: charAt with a lowercase 'c'
                    operations += Math.abs(i - j);
                }
            }
            answer[i] = operations;
        }
        
        return answer;
    }
}
