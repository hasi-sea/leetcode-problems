class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in our window of size k, we found a match
            if (window.contains(nums[i])) {
                return true;
            }
            
            // Add the current element to the window
            window.add(nums[i]);
            
            // If the window size exceeds k, remove the oldest element
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
