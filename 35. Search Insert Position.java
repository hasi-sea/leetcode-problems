class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            // Calculating mid this way prevents integer overflow for massive arrays
            int mid = left + (right - left) / 2; 
            
            if (nums[mid] == target) {
                return mid; // We found the exact target, return its index
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is bigger, search the right half
            } else {
                right = mid - 1; // Target is smaller, search the left half
            }
        }
        
        // If the loop finishes without returning, the target isn't in the array.
        // 'left' is now pointing to the exact index where it should be inserted.
        return left;
    }
}
