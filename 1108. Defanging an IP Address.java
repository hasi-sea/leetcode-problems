class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder();
        
        // Loop through every character in the IP address
        for (char c : address.toCharArray()) {
            if (c == '.') {
                defanged.append("[.]");
            } else {
                defanged.append(c);
            }
        }
        
        return defanged.toString();
    }
}
