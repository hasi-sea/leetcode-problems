class Solution {
    public int removeElement(int[] nums, int val) {
        // 'k' will keep track of the index for the next valid element
        int k = 0; 
        
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not the value we want to remove
            if (nums[i] != val) {
                // Place it at the 'k' index and increment 'k'
                nums[k] = nums[i];
                k++;
            }
        }
        
        // 'k' represents the number of elements that are not equal to 'val'
        return k;
    }
}
