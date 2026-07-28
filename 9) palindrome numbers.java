class Solution {
    public boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome (e.g., -121 becomes 121-)
        // If a number ends in 0, it can only be a palindrome if the number itself is 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        
        // We only need to reverse the second half of the number
        // Once x is less than or equal to revertedNumber, we've reached the middle
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // For even length numbers, x will equal revertedNumber (e.g., 1221 -> x = 12, reverted = 12)
        // For odd length numbers, we can divide revertedNumber by 10 to drop the middle digit (e.g., 12321 -> x = 12, reverted = 123)
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
