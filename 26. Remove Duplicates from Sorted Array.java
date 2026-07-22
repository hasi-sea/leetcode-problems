class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, there are 0 unique elements
        if (nums.length == 0) {
            return 0;
        }
        
        // This acts as both the pointer for insertion and the counter for unique elements
        int insertIndex = 1; 
        
        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i]; // Place it at the correct index
                insertIndex++; // Move the insert pointer forward
            }
        }
        
        // insertIndex now holds the exact count of unique elements (k)
        return insertIndex;
    }
}
