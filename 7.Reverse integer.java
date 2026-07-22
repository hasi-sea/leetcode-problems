class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            // Extract the last digit of x
            int pop = x % 10;
            // Remove the last digit from x
            x /= 10;
            
            // Check for overflow BEFORE adding the digit to rev
            // Max 32-bit int is  2147483647
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // Min 32-bit int is -2147483648
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            
            // Push the digit onto rev
            rev = rev * 10 + pop;
        }
        
        return rev;
    }
}
