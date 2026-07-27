import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {

        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Check each word
        for (String word : words) {

            int[] freq = new int[26];

            // Count frequency of characters
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Keep minimum frequency
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();

        // Add common characters
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char)(i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }
}
