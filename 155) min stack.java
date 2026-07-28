class MinStack {
    private java.util.Stack<Integer> stack;
    private java.util.Stack<Integer> minStack;

    public MinStack() {
        stack = new java.util.Stack<>();
        minStack = new java.util.Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
        // Push the value to the minStack if it's empty or if the value is a new minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        // We use .equals() here because stack.pop() returns an Integer object.
        // If we pop the current minimum from the main stack, we must also pop it from minStack.
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
