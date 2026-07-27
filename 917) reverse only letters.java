class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // If the left character is not a letter, move the left pointer forward
            if (!Character.isLetter(chars[left])) {
                left++;
            } 
            // If the right character is not a letter, move the right pointer backward
            else if (!Character.isLetter(chars[right])) {
                right--;
            } 
            // If both are letters, swap them and move both pointers
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
}
