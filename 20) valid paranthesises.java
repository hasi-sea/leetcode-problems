class Solution {
    public boolean isValid(String s) {
        // Use a stack to keep track of the expected closing brackets
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (char c : s.toCharArray()) {
            // When we encounter an open bracket, we push its corresponding closing bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // When we encounter a closing bracket, it must match the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        // If the stack is empty at the end, all brackets were valid and matched
        return stack.isEmpty();
    }
}
