class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                // Left is even, it's in the correct place. Move forward.
                left++;
            } 
            else if (nums[right] % 2 != 0) {
                // Right is odd, it's in the correct place. Move backward.
                right--;
            } 
            else {
                // Left is odd and right is even. Swap them.
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                // After swapping, move both pointers
                left++;
                right--;
            }
        }
        
        return nums;
    }
}
