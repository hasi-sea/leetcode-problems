import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        // Step 1: Find the minimum and maximum values in the array
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // If all elements are the same, the max gap is 0
        if (min == max) {
            return 0;
        }

        int n = nums.length;
        
        // Step 2: Determine bucket size and number of buckets
        // The minimum possible max gap is ceil((max - min) / (n - 1))
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        // Arrays to store the min and max values within each bucket
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        // Step 3: Distribute numbers into buckets
        for (int num : nums) {
            int bucketIdx = (num - min) / bucketSize;
            bucketMin[bucketIdx] = Math.min(bucketMin[bucketIdx], num);
            bucketMax[bucketIdx] = Math.max(bucketMax[bucketIdx], num);
        }

        // Step 4: Calculate the maximum gap
        int maxGap = 0;
        int prevMax = min; // Keeps track of the maximum value of the previous non-empty bucket
        
        for (int i = 0; i < bucketCount; i++) {
            // Skip empty buckets
            if (bucketMin[i] == Integer.MAX_VALUE) {
                continue; 
            }
            // The gap is the difference between the current bucket's min and the previous bucket's max
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }
}
