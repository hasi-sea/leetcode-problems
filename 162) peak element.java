class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the middle element is greater than its right neighbor,
            // we are on a descending slope. A peak must exist to the left (including mid).
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } 
            // If the middle element is less than its right neighbor,
            // we are on an ascending slope. A peak must exist to the right of mid.
            else {
                left = mid + 1;
            }
        }
        
        // When left == right, we have found a peak element
        return left;
    }
}
