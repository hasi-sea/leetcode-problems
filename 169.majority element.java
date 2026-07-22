class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            // When count drops to 0, we pick a new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // Increment count if it's our candidate, otherwise decrement
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
