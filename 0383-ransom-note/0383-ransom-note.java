class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Since both strings consist of lowercase English letters, 
        // an array of size 26 is sufficient to store character counts.
        int[] charCounts = new int[26];
        
        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        // Iterate through the ransomNote and decrement the available count
        for (char c : ransomNote.toCharArray()) {
            // If the count drops below 0, we don't have enough of this character
            if (charCounts[c - 'a'] == 0) {
                return false;
            }
            charCounts[c - 'a']--;
        }
        
        // If we make it through the loop, we can construct the note
        return true;
    }
}