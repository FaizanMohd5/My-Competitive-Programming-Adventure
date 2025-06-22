class MyStack {
    // my idea is to keep the newly inserted element of queue to the front instead of rear. 
    
    Queue<Integer> queue;
    
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        
        int prevSize = queue.size();

        queue.add(x);

        for(int i = 0; i < prevSize; i++){

            int val = queue.remove();

            queue.add(val);

        }

    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
