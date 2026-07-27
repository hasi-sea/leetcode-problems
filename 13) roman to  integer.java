class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        
        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getVal(s.charAt(i));
            
            // If current value is less than previous, we subtract it (e.g., IV -> 5 - 1)
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, we add it
                total += currentValue;
            }
            
            // Update previous value for the next iteration
            prevValue = currentValue;
        }
        
        return total;
    }
    
    // Helper method to map Roman characters to integers
    private int getVal(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
