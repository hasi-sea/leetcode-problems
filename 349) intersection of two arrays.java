import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Add all elements from the first array to a set to remove duplicates
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Find common elements and add them to the intersection set
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersect.add(num);
            }
        }
        
        // Convert the intersection set back to an array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        
        return result;
    }
}
