class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the area with the current left and right pointers
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = currentHeight * width;
            
            // Update the maximum area found so far
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer that has the shorter height inward
            // (Moving the taller one cannot possibly increase the area since width decreases)
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
