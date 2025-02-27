class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        
        this.stack = new Stack<>();
        this.minStack = new Stack<>();

    }
    
    public void push(int val) {
        
        stack.push(val);

        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }

    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();

        if(minStack.peek() == x)
            minStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */