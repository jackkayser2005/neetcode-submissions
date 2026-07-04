class MinStack {
     private final Stack<Integer> stack = new Stack<>(); 
     private final Stack<Integer> minStack = new Stack<>(); 
    public MinStack() {
        //nothing needed here 
    }
    
    public void push(int val) {
        stack.push(val); 

        if(minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val); 
        } else {
            minStack.push(minStack.peek()); 
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return; 
        stack.pop(); 
        minStack.pop(); 
    }
    
    public int top() {
        if(stack.isEmpty()) throw new java.util.EmptyStackException(); 
        return stack.peek();  
    }
    
    public int getMin() {
        if(stack.isEmpty()) throw new java.util.EmptyStackException(); 
        return minStack.peek(); 
        
    }
}
