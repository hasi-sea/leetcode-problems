class Solution {
    public int firstUniqChar(String s) {
        // Array to store the frequency of each lowercase English letter
        int[] freq = new int[26];
        
        // First pass: Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Second pass: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // If no unique character is found, return -1
        return -1;
    }
}
